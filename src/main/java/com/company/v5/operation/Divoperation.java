package com.company.v5.operation;

public class Divoperation implements Operation {

    public Double execute(Double[] numbers) throws InvalidCalcOperationException {

        if(numbers[1] == 0){
            throw new InvalidCalcOperationException("Do not divide by zero");
        }
        return numbers[0] / numbers[1];

    }
}
