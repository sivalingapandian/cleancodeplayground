package com.medhost.cleancode;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pandian on 6/11/15.
 */
public class ReturnValueFinalBlockTest {

    @Test
    public void shouldReturnEvenNumber() throws Exception {
        int number = 4;
        Assert.assertEquals(number, new ReturnValueFinalBlock().findEvenNumber(number));
    }

    @Test
    public void shouldReturnOddNumber() {
        int number = 5;
        Assert.assertEquals(number, new ReturnValueFinalBlock().findOddNumber(number));
    }

    @Test (expected = Exception.class)
    public void shouldThrowExceptionForOddNumber() throws  Exception{
        new ReturnValueFinalBlock().findEvenNumber(5);
    }

    @Test(expected = Error.class)
    public void shouldThrowErrorForEvenNumber() {
        new ReturnValueFinalBlock().findOddNumber(4);
    }
}