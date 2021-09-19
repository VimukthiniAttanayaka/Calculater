package com.company.v5.operation;

//factory design fashion
public class OperationFactory {
    
    public Operation getInstance(String operator){
        Operation operation = null;
        if(operator.equals("add"))
        {
            operation = new Addoperation();

        }else if(operator.equals("sub"))
        {
            operation=new Suboperation();

        }else if(operator.equals("mul"))
        {
            operation=new Muloperation();
        }else if(operator.equals("div"))
        {
            operation=new Divoperation();
        }
        return operation;
    }
}
