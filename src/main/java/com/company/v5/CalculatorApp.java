package com.company.v5;

import com.company.v5.input.CommandLineInputs;
import com.company.v5.input.Input;
import com.company.v5.input.InvalidInputException;
import com.company.v5.operation.InvalidCalcOperationException;
import com.company.v5.operation.Operation;
import com.company.v5.operation.OperationFactory;
import com.company.v5.repository.FileNumberRepository;
import com.company.v5.repository.NumberRepository;
import com.company.v5.repository.NumberRepositoryException;
import com.company.v5.ui.CmdLineUI;
import com.company.v5.ui.UI;

import java.io.IOException;

public class CalculatorApp {

    private final Input inputs;
    private final NumberRepository numberRepository;
    private final OperationFactory operationFactory;
    private final UI ui;

    public CalculatorApp(Input inputs, NumberRepository numberRepository, OperationFactory operationFactory, UI ui) {

        this.inputs = inputs;
        this.numberRepository = numberRepository;
        this.operationFactory = operationFactory;
        this.ui = ui;
    }

    public void execute(){
        try{
        String operator = inputs.getOperator();
        Double[] numbers = numberRepository.getNumbers();
        Operation operation = operationFactory.getInstance(operator);
        Double result = operation.execute(numbers);
        ui.showMessage("The result is " + result);
        } catch (InvalidCalcOperationException | NumberRepositoryException | InvalidInputException e) {
            ui.showMessage("Error Occurred " + e.getMessage());
        }
    }
}