package com.company.v5.input;

public class CommandLineInputs implements Input {

    private  String[] args;

    //constructor of the class
    public CommandLineInputs(String[] arguments){
        this.args = arguments;
    }
    public  String getOperator() throws InvalidInputException {
        if(args.length==0){
            throw new InvalidInputException("Please provide the operation as an argument");
        }

        String operator=args[0];
        if(!(operator.equals("add")||operator.equals("sub")||operator.equals("mul")||operator.equals("div"))){
            throw new InvalidInputException("Please provide the operation as an argument");
        }
        return operator;
    }
}
