
package salestargetcalculator;

import salestargetcalculator.input.Inputs;
import salestargetcalculator.input.InvaidInputException;
import salestargetcalculator.operation.InvalidCalcOperationException;
import salestargetcalculator.operation.Operation;
import salestargetcalculator.repository.ExperienceRepositoryException;
import salestargetcalculator.ui.UI;
import salestargetcalculator.repository.ExperienceRepository;

public class SalesTargetCalculator {

    private final Inputs inputs;
    private final ExperienceRepository experienceRepository;
    private final Operation operation;
    private final UI ui;

    public SalesTargetCalculator(Inputs inputs, ExperienceRepository experienceRepository, Operation operation, UI ui) {
        this.inputs = inputs;
        this.experienceRepository = experienceRepository;
        this.operation = operation;
        this.ui = ui;
    }

    public void execute() {
        try {
            int id = inputs.getInputID();
            String ExperienceAndPosition[]  = experienceRepository. getExperienceAndPosition(id);
            Double result = operation.execute(ExperienceAndPosition);
            ui.showMessage("The sales target: " + result);
        } catch (InvalidCalcOperationException | InvaidInputException | ExperienceRepositoryException e) {
            ui.showMessage("Error Occurred." + e.getMessage());
        } 
    }
}
