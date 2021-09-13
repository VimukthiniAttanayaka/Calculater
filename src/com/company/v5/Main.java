package com.company.v5;

import com.company.v5.input.CommandLineInputs;
import com.company.v5.input.Input;
import com.company.v5.operation.Operation;
import com.company.v5.operation.OperationFactory;
import com.company.v5.repository.FileNumberRepository;
import com.company.v5.repository.NumberRepository;
import com.company.v5.ui.CmdLineUI;
import com.company.v5.ui.UI;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Input inputs = new CommandLineInputs(args);
        NumberRepository numberRepository = new FileNumberRepository();
        OperationFactory operationFactory = new OperationFactory();
        UI ui = new CmdLineUI();
        CalculatorApp app = new CalculatorApp(inputs ,numberRepository ,operationFactory ,ui);
        app.execute();
    }
}
