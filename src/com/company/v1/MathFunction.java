package com.company.v1;

public class MathFunction {
    static int addSubMul(String icon,int num1,int num2){
        int sum;
        if(icon.equals("+")){
            sum = add(num1,num2);
            return sum;
        }
        else if(icon.equals("-")){
            sum = sub(num1,num2);
            return sum;
        }
        else{
            sum = mul(num1,num2);
            return sum;
        }
    }
    private static int add(int numb1,int numb2){
        int sum = numb1+numb2;
        return sum;
    }
    private static int sub(int numb1,int numb2){
        int sum = numb1-numb2;
        return sum;
    }
    private static int mul(int numb1,int numb2){
        int sum = numb1*numb2;
        return sum;
    }
}
