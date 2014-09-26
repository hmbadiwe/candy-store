package learning.candystore.controller;

import com.learning.candystore.common.SweetMessage;
import com.learning.candystore.controller.CandyAction;
import com.learning.candystore.core.entity.Candy;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import learning.ControllerClientSideTestBase;


/**
 *
 * @author rugal
 */
public class CandyActionTest extends ControllerClientSideTestBase
{

    @Autowired
    private CandyAction candyAction;

    public CandyActionTest()
    {
    }

    @Test
    public void testRegisterStudent() throws Exception
    {
        System.out.println("registerStudent");
        this.mockMvc.perform(post("/student")
            .content("{\"id\":\"3\",\"name\":\"tenjin\",\"age\":\"23\"}")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk());
        System.out.println("Rugal Bernstein");
    }

    //    @Test
    public void testUpdateStudentProfile()
    {
        System.out.println("updateStudentProfile");
        Integer id = null;
        Candy bean = null;
        CandyAction instance = new CandyAction();
        SweetMessage expResult = null;
        SweetMessage result = instance.updateStudentProfile(id, bean);
    }

//    @Test
    public void testDeregister()
    {
        System.out.println("cancelOrder");
        Integer id = null;
        CandyAction instance = new CandyAction();
        SweetMessage expResult = null;
        SweetMessage result = instance.deregister(id);
    }

//    @Test
    public void testRetrieve()
    {
        System.out.println("retrieve");
        Integer id = null;
        CandyAction instance = new CandyAction();
        SweetMessage expResult = null;
        SweetMessage result = instance.retrieve(id);
    }

}
