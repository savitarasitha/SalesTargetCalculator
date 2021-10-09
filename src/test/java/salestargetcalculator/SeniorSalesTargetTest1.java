package salestargetcalculator;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import salestargetcalculator.operation.CalculateSalesTarget;
import static org.hamcrest.MatcherAssert.assertThat;
import salestargetcalculator.operation.InvalidCalcOperationException;

public class SeniorSalesTargetTest1 {
     @Test
    public void calculate_Experience_MoreThanAYear(){

        CalculateSalesTarget juniorTarget = new CalculateSalesTarget();  
        String[] expAndPos = new String[2];
        expAndPos [0] = "senior";
        expAndPos [1] = "2";
        Double result = null;
         try {
             result = juniorTarget.execute(expAndPos);
         } catch (InvalidCalcOperationException ex) {
            System.out.println(ex.getMessage());
         }
        assertThat(result, is(24.0));
    }

   @Test
    public void calculate_Experience_LessThanAYear(){

        CalculateSalesTarget juniorTarget = new CalculateSalesTarget();  
        String[] expAndPos = new String[2];
        expAndPos [0] = "senior";
        expAndPos [1] = "0.8";
        Double result = null;
         try {
             result = juniorTarget.execute(expAndPos);
         } catch (InvalidCalcOperationException ex) {
             System.out.println(ex.getMessage());
         }
        assertThat(result, is(20.0));
    }
 

}
