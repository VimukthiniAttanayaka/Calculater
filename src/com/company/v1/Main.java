package com.company.v1;

public class Main {
    public static void main(String[] args) {

        int[] numArr=ReadNumbers.readFile();
        int num1 = numArr[0];
        int num2 = numArr[1];
        String cal = GetUserInput.witchFunction();
        int sum = MathFunction.addSubMul(cal,num1,num2);
        PrintSum.output(sum);
    }
}





