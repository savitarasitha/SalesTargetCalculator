package salestargetcalculator;

import salestargetcalculator.input.CommandLineInputs;
import salestargetcalculator.input.Inputs;
import salestargetcalculator.operation.CalculateSalesTarget;
import salestargetcalculator.operation.Operation;
import salestargetcalculator.repository.SalesmanRepository;
import salestargetcalculator.ui.CmdLineUI;
import salestargetcalculator.ui.UI;
import salestargetcalculator.repository.ExperienceRepository;

public class Main {

    public static void main(String[] args)  {
        
        Inputs inputs = new CommandLineInputs(args);
        ExperienceRepository numberRepository = new SalesmanRepository();
        Operation operation = new CalculateSalesTarget();
        UI ui = new CmdLineUI();
        SalesTargetCalculator app = new SalesTargetCalculator(inputs, numberRepository, operation, ui);
        app.execute();
    }

}