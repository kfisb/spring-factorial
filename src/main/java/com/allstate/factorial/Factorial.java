package com.allstate.factorial;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger calculate(BigInteger num){
        BigInteger factorial = BigInteger.valueOf(1);

        for(int i = 1; i <= num.intValue(); i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;

    }

}
