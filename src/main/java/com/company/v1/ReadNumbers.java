package com.company.v1;

import java.io.File;
import java.util.Scanner;

public class ReadNumbers {
    static int[] readFile(){
        File file = new File("C:\\Users\\attanaya-se18006\\Desktop\\Calculater\\src\\java\\com.kelaniya.uni\\numbers.txt");
        int[] numbers = new int[2];
        int i = 0;
        try{
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextInt())
            {
                numbers[i] = scanner.nextInt();
                i++;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return numbers;
    }
}
