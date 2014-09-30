package com.learning.candystore.core.dao.impl;

import com.learning.candystore.controller.ExceptionAction;
import com.learning.candystore.core.dao.CandyDao;
import com.learning.candystore.core.entity.Candy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Rugal Bernstein
 */
@Repository
public class CandyDaoImpl implements CandyDao
{
    @Autowired
    private SessionFactory sessionFactory;

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(ExceptionAction.class
        .getName());

    @Override
    public Candy findById(Integer id)
    {
        Candy entity = (Candy)getSession().get(Candy.class, id);
        return entity;
    }

    @Override
    public Integer save(Candy bean)
    {
        getSession().save(bean);
        return bean.getId();
    }

    @Override
    public Candy deleteById(Integer id)
    {
        Candy entity = findById(id);
        if (entity != null)
        {
            getSession().delete(entity);
        }
        return entity;
    }


    @Override
    public Candy update(Candy candy) {
        return null;
    }

    private Session getSession(){
        return this.sessionFactory.getCurrentSession();
    }
}
