package salestargetcalculator.operation;

public class CalculateSalesTarget implements Operation {

    public Double execute(String[] ExperienceAndPosition) throws InvalidCalcOperationException{
        if(ExperienceAndPosition == null){
            throw new InvalidCalcOperationException("The entered ID was not found!");    
        }
        Double result = 0.0;
        try{
        String position = ExperienceAndPosition[0];
        Double experience = Double.parseDouble(ExperienceAndPosition[1]);
        switch(position){
            
            case"intern":
                result = 10.0;                
                break;
            
            case"junior":      
                if(experience >= 1){
                   result = 15 + (experience * 2);
                }
                else{
                    result = 15.0;
                }
                
                break;
                
            case"senior":
                if(experience >= 1){
                   result = 20 + (experience * 2);
                }
                else{
                    result = 20.0;
                }
                break;
                
        }
        } catch(NumberFormatException | IndexOutOfBoundsException e){
             throw new InvalidCalcOperationException("Calculation can't be done with given inputs");          
        }
        return result;
    }
}
