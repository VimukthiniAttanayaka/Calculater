package com.company.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class DivoperationTest {

    @Test
    public void should_divide_positive_values() throws InvalidCalcOperationException {

        Divoperation divoperation=new Divoperation();
        Double result = divoperation.execute(new Double[]{6.0,3.0});

        assertThat(result,is(2.0));
    }

    @Test
    public void should_not_divide_by_zero() throws InvalidCalcOperationException {

        Divoperation divoperation=new Divoperation();
        Double result = divoperation.execute(new Double[]{6.0,0.0});

        //assertThat(result,is(0.0));
    }

}