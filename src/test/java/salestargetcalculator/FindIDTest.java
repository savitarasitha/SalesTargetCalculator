package salestargetcalculator;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;
import salestargetcalculator.repository.ExperienceRepositoryException;
import salestargetcalculator.repository.SalesmanRepository;


public class FindIDTest {
    
     @Test
    public void findIdFromRepositoryTest(){

        SalesmanRepository repository = new SalesmanRepository();  
        String[] expAndPos;
         try {
             expAndPos = repository.getExperienceAndPosition(2);
             assertThat(expAndPos,notNullValue());
         }  catch (ExperienceRepositoryException ex) {
             System.out.println(ex.getMessage());
         }
        
    }
    
     @Test
    public void IdFromRepositoryNotFoundTest(){

        SalesmanRepository repository = new SalesmanRepository();  
        String[] expAndPos;
         try {
             expAndPos = repository.getExperienceAndPosition(245);
             assertThat(expAndPos,nullValue());
         }  catch (ExperienceRepositoryException ex) {
             System.out.println(ex.getMessage());
         }
        
    }
}
