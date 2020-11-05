package com.snijsure.sonarcoverage;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class MathServiceTest {
    private MathService mathService;

    @Before
    public void setUp() {
        mathService = new MathService();
    }

    @Test
    public void multipliesNumbers() {
        int result = mathService.multiply(2, 4);

        assertThat(result, equalTo(8));
    }

    @Test
    public void testFactorial() {
        Integer retValue = mathService.factorial(3, 1);
        assertThat(retValue, equalTo(6));
    }
}
