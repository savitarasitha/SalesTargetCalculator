package salestargetcalculator.input;

public class CommandLineInputs implements Inputs {

    private String[] args;
    private int id;
    //Constructor of the class
    public CommandLineInputs(String[] arguments) {
        this.args = arguments;
    }

    public int getInputID() throws InvaidInputException {
        //validate the arguments
        if (args.length == 0) {
            throw new InvaidInputException("Please provide the operation as an argument");
        }

        String operator = args[0];
        try
            {
                this.id = Integer.parseInt(operator);
                
            } catch (NumberFormatException ex)
            {
                throw new InvaidInputException("Invalid arguments! Please provide the valid ID only");
        
            }
       

        return this.id;

    }
}
