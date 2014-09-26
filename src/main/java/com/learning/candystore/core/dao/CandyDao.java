package  com.learning.candystore.core.dao;

import com.learning.candystore.core.entity.Candy;


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
