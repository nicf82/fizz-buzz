package com.example.fizzbuzz;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest  {
    @Test
    public void evaluatesExpression() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        FizzBuzzResult actual = fizzBuzz.evaluate(1, 20);

        String expectedOutput = "1 2 luck 4 buzz fizz 7 8 fizz buzz 11 fizz luck 14 fizzbuzz 16 17 fizz 19 buzz";

        assertEquals(expectedOutput, actual.getOutput());

        assertEquals(4, actual.getFizzCount());
        assertEquals(3, actual.getBuzzCount());
        assertEquals(1, actual.getFizzBuzzCount());
        assertEquals(2, actual.getLuckCount());
        assertEquals(10, actual.getNumberCount());
    }
}