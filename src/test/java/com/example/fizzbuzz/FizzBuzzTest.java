package com.example.fizzbuzz;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest  {
    @Test
    public void evaluatesExpression() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String actual = fizzBuzz.evaluate(1, 20);

        String expected = "1 2 luck 4 buzz fizz 7 8 fizz buzz 11 fizz luck 14 fizzbuzz 16 17 fizz 19 buzz";
        
        assertEquals(expected, actual);
    }
}