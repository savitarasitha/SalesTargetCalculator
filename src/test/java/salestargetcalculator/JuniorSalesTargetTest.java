package salestargetcalculator;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import salestargetcalculator.operation.CalculateSalesTarget;
import static org.hamcrest.MatcherAssert.assertThat;
import salestargetcalculator.operation.InvalidCalcOperationException;

public class JuniorSalesTargetTest {
     @Test
    public void calculate_Experience_MoreThanAYear(){

        CalculateSalesTarget juniorTarget = new CalculateSalesTarget();  
        String[] expAndPos = new String[2];
        expAndPos [0] = "junior";
        expAndPos [1] = "4";
        Double result = null;
         try {
             result = juniorTarget.execute(expAndPos);
         } catch (InvalidCalcOperationException ex) {
             System.out.println(ex.getMessage());
         }
        assertThat(result, is(23.0));
    }

   @Test
    public void calculate_Experience_LessThanAYear(){

        CalculateSalesTarget juniorTarget = new CalculateSalesTarget();  
        String[] expAndPos = new String[2];
        expAndPos [0] = "junior";
        expAndPos [1] = "0.5";
        Double result = null;
         try {
             result = juniorTarget.execute(expAndPos);
         } catch (InvalidCalcOperationException ex) {
             System.out.println(ex.getMessage());
         }
        assertThat(result, is(15.0));
    }
 

}
