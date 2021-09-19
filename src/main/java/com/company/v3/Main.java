package com.company.v3;

import com.company.v3.operation.Addoperation;
import com.company.v3.operation.Muloperation;
import com.company.v3.operation.Suboperation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();
        Double number1 = numbers[0];
        Double number2 = numbers[1];

        Double result = 0.0;
        if(operator.equals("add"))

        {
            Addoperation addoperation = new Addoperation();
            result = addoperation.execute(numbers);

        }else if(operator.equals("sub"))
        {
            Suboperation suboperation=new Suboperation();
            result=suboperation.execute(numbers);

        }else if(operator.equals("mul"))
        {
            Muloperation muloperation=new Muloperation();
            result =muloperation.execute(numbers);
        }

        System.out.println("The result is "+result);
    }
}
