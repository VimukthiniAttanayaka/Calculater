package com.company.v5.input;

public class CommandLineInputs implements Input {

    private  String[] args;

    //constructor of the class
    public CommandLineInputs(String[] arguments){
        this.args = arguments;
    }
    public  String getOperator(){
        if(args.length==0){
            System.out.println("Please provide operator as an argument");
            return "";
        }

        //command line argument validation 2
        //add,sub,mul
        String operator=args[0];
        if(!(operator.equals("add")||operator.equals("sub")||operator.equals("mul")||operator.equals("div"))){
            System.out.println("Please provide add,sum or mul as a command line argument");
            return "";
        }
        return operator;
    }
}
