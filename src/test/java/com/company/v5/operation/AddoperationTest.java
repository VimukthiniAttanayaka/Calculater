package com.company.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AddoperationTest {

    //test cases
    //positive number+positive number => correct answer
    //zero+zero => 0
    //negative number+negative number => correct answer
    //negative number+positive number => correct answer

    @Test
    public void should_add_positive_values(){

        Addoperation addoperation=new Addoperation();
        Double result = addoperation.execute(new Double[]{5.0,6.0});

        assertThat(result,is(11.0));
    }

    @Test
    public void should_add_zeros(){

        Addoperation addoperation=new Addoperation();
        Double result = addoperation.execute(new Double[]{0.0,0.0});

        assertThat(result,is(0.0));
    }

    @Test
    public void should_add_negative_values(){

        Addoperation addoperation=new Addoperation();
        Double result = addoperation.execute(new Double[]{-1.0,-2.0});

        assertThat(result,is(-3.0));
    }
}