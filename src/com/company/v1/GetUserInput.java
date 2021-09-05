package com.company.v1;
import java.util.Scanner;

public class GetUserInput {
    static String witchFunction(){
        String simble;
        System.out.println("What you need to do(+ for Add ,- for Sub , * for Mul):");
        Scanner scanner = new Scanner(System.in);
        do {
            simble = scanner.nextLine();
            if(simble.equals("+")||simble.equals("-")||simble.equals("*")){
                break;
            }
            else{
                System.out.println("Wrong input, Enter again:");
            }
        }while (true);
        return simble;
    }
}
