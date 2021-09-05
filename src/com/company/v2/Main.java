package com.company.v2;

public class Main {

    public static void main(String[] args) {
        //print command line argument
        //System.out.println(args[0]);

        //command line argument validation 1
        if(args.length==0){
            System.out.println("Please provide operator as an argument");
            return;
        }
        //System.out.println(args[0]);

        //command line argument validation 2
        //add,sub,mul
        String operator=args[0];
        if(!(operator.equals("add")||operator.equals("sub")||operator.equals("mul"))){
            System.out.println("Please provide add,sum or mul as a command line argument");
            return;
        }
        System.out.println(args[0]);
    }
}
