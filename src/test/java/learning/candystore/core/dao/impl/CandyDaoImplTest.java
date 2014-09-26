package learning.candystore.core.dao.impl;

import com.learning.candystore.core.dao.CandyDao;
import com.learning.candystore.core.entity.Candy;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import learning.JUnitSpringTestBase;


/**
 *
 * @author rugal
 */
public class CandyDaoImplTest extends JUnitSpringTestBase
{

    @Autowired
    private CandyDao candyDao;

    public CandyDaoImplTest()
    {
    }



    @Test
    public void testFindById()
    {
        System.out.println("findById");
        Integer id = 1;
        Candy result = candyDao.findById(id);
    }

//    @Test
    public void testSave()
    {
        System.out.println("save");
        Candy bean = new Candy();
        bean.setId(1);
        bean.setAge(23);
        bean.setName("Rugal Bernstein");
        Integer result = candyDao.save(bean);
    }

//    @Test
    public void testDeleteById()
    {
        System.out.println("deleteById");
        Integer id = 1;
        Candy result = candyDao.deleteById(id);
    }

}
