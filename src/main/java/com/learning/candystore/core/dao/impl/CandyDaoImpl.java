package com.learning.candystore.core.dao.impl;

import com.learning.candystore.controller.ExceptionAction;
import com.learning.candystore.core.dao.CandyDao;
import com.learning.candystore.core.entity.Candy;
import ml.rugal.sshcommon.hibernate.HibernateBaseDao;
import ml.rugal.sshcommon.page.Pagination;
import org.hibernate.Criteria;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Rugal Bernstein
 */
@Repository
public class CandyDaoImpl extends HibernateBaseDao<Candy, Integer> implements CandyDao
{

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(ExceptionAction.class
        .getName());

    @Override
    public Candy findById(Integer id)
    {
        Candy entity = get(id);
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
//        throw new UnsupportedOperationException();
        Candy entity = super.get(id);
        if (entity != null)
        {
            getSession().delete(entity);
        }
        return entity;
    }

    @Override
    protected Class<Candy> getEntityClass()
    {
        return Candy.class;
    }

    @Override
    public Candy update(Candy candy) {
        return null;
    }
}
