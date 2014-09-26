package com.learning.candystore.controller;

import com.learning.candystore.common.CommonMessageContent;
import com.learning.candystore.common.SweetMessage;
import com.learning.candystore.core.entity.Candy;
import com.learning.candystore.core.service.CandyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * A sample controller class for GET/DELETE/POST/PUT.
 *
 * @author Rugal Bernstein
 */
@Controller
@RequestMapping(value = "/student")
public class StudentAction
{

    private static final Logger LOG = LoggerFactory.getLogger(StudentAction.class.getName());

    @Autowired
    private CandyService candyService;

    /**
     * Persist a student bean into database.
     *
     * @param bean student bean resembled from request body.
     * @return The persisted student bean.
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public SweetMessage registerStudent(@RequestBody Candy bean)
    {
        candyService.save(bean);
        /*
         * Now we need to push message notify them
         */
        return SweetMessage.successMessage(CommonMessageContent.SAVE_SUCCEED, bean);
    }

    /**
     * Update a student bean.
     *
     * @param id   primary key of target student.
     * @param bean the newer student bean
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public SweetMessage updateStudentProfile(@PathVariable("id") Integer id, @RequestBody Candy bean)
    {
        Candy dbStudent = candyService.findById(id);
        if (null != dbStudent)
        {
            candyService.update(bean);
        }
        /*
         * Here we need to push message to client
         */
        return SweetMessage.successMessage(CommonMessageContent.PROFILE_UPDATED, bean);
    }

    /**
     * DELETE a student record from database.
     *
     * @param id the target student id.
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public SweetMessage deregister(@PathVariable("id") Integer id)
    {
        Candy bean = candyService.findById(id);
        if (null != bean)
        {
            candyService.deleteById(id);
        }
        return SweetMessage.successMessage(CommonMessageContent.STUDENT_DELETED, bean);
    }

    /**
     * GET a student record from database.
     *
     * @param id primary key of target student.
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public SweetMessage retrieve(@PathVariable("id") Integer id)
    {
        Candy bean = candyService.findById(id);
        return SweetMessage.successMessage(CommonMessageContent.GET_STUDENT, bean);
    }
}
