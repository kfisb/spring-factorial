package com.allstate.factorial;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 2/2/17.
 */
public class FactorialTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCalculateFactorial() throws Exception {
        BigInteger inputValue2 = BigInteger.valueOf(2);
        BigInteger outputValue2 = BigInteger.valueOf(2);
        assertEquals(outputValue2, Factorial.calculate(inputValue2));

        BigInteger inputValue3 = BigInteger.valueOf(3);
        BigInteger outputValue6 = BigInteger.valueOf(6);
        assertEquals(outputValue6, Factorial.calculate(inputValue3));

        BigInteger inputValue10 = BigInteger.valueOf(10);
        BigInteger outputValue10 = BigInteger.valueOf(3628800);
        assertEquals(outputValue10, Factorial.calculate(inputValue10));
    }
}