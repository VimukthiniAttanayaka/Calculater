package com.company.v4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
    public Double[] getNumbers() throws IOException { //will change method signater too

        //read the numbers text file
        List<String> numbersStrs = Files.readAllLines(
                Paths.get("F:\\java\\Calculater\\Numbers.txt")
        );

        Double number1 = Double.parseDouble(numbersStrs.get(0));
        Double number2 = Double.parseDouble(numbersStrs.get(1));

        return new Double[]{number1,number2};
    }
}
