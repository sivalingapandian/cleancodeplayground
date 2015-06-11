package com.medhost.cleancode;

import java.io.IOError;

/**
 * Created by pandian on 6/9/15.
 */
public class ReturnValueFinalBlock {

    public int findEvenNumber(int number) throws Exception {
        try {
            if (number % 2 != 0) {
                throw new Exception("Odd Number");
            }
        }finally {
            return number;
        }
    }

    public int findOddNumber(int number) {
        try {
            if( number % 2 != 0) {
                //good to go
            } else {
                throw new IOError(new Throwable("Even Number"));
            }
        } finally {
            return number;
        }
    }

}
