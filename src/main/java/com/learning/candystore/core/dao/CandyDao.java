package  com.learning.candystore.core.dao;

import com.learning.candystore.core.entity.Candy;
import ml.rugal.sshcommon.hibernate.Updater;
import ml.rugal.sshcommon.page.Pagination;
import rugal.sample.core.entity.Student;

/**
 *
 * @author Rugal Bernstein
 */
public interface CandyDao
{

    Candy deleteById(Integer id);

    Candy findById(Integer id);


    Integer save(Candy bean);

    Candy update(Candy candy);

}
