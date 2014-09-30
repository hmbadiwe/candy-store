package  com.learning.candystore.core.service;

import com.learning.candystore.core.entity.Candy;


/**
 *
 * @author Rugal Bernstein
 */
public interface CandyService
{

    Candy deleteById(Integer id);

    Candy findById(Integer id);

    Integer save(Candy bean);

    Candy update(Candy bean);

}
