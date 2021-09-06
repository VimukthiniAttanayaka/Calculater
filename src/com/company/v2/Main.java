package com.company.v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //print command line argument

        //command line argument validation 1
        if(args.length==0){
            System.out.println("Please provide operator as an argument");
            return;
        }

        //command line argument validation 2
        //add,sub,mul
        String operator=args[0];
        if(!(operator.equals("add")||operator.equals("sub")||operator.equals("mul"))){
            System.out.println("Please provide add,sum or mul as a command line argument");
            return;
        }
        System.out.println(args[0]);

        //exception handling
        //try catch or throws

        //lists
        try{
            List<String> numbeStrs = Files.readAllLines(Paths.get("F:\\java\\Calculater\\Numbers.txt"));
            System.out.println(numbeStrs.get(0));
            System.out.println(numbeStrs.get(1));

            Double number1 = Double.parseDouble(numbeStrs.get(0));
            Double number2 = Double.parseDouble(numbeStrs.get(1));

            Double result = 0.0;
            if(operator.equals("add")){
                result = number1 + number2;
            }
            else if(operator.equals("sub")){
                result = number1 - number2;
            }
            else if(operator.equals("mul")){
                result = number1 * number2;
            }
            System.out.println("The resalt is "+ result);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
