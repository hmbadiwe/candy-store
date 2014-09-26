package  com.learning.candystore.core.service.impl;

import com.learning.candystore.core.dao.CandyDao;
import com.learning.candystore.core.entity.Candy;
import com.learning.candystore.core.service.CandyService;
import ml.rugal.sshcommon.hibernate.Updater;
import ml.rugal.sshcommon.page.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Rugal Bernstein
 */
@Service
@Transactional
public class CandyServiceImpl implements CandyService
{

    @Autowired
    private CandyDao candyDao;

    @Override
    public Candy deleteById(Integer id)
    {
        //Used for transaction test
        return candyDao.deleteById(id);
//        throw new UnsupportedOperationException();
    }

    @Override
    @Transactional(readOnly = true)
    public Candy findById(Integer id)
    {
        return candyDao.findById(id);
    }



    @Override
    public Integer save(Candy bean)
    {
        //Used for transaction test
        return candyDao.save(bean);
    }

    @Override
    public Candy update(Candy bean)
    {
        return null;
    }

}
