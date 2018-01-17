package com.example.fizzbuzz;


public class FizzBuzz {

    public static void main(String[] args) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        FizzBuzzResult fizzBuzzResult = fizzBuzz.evaluate(1, 20);

        System.out.println( fizzBuzzResult.toOutputFormattedString() );
    }

    public FizzBuzzResult evaluate(int start, int end) {

        StringBuilder buffer = new StringBuilder();
        FizzBuzzResult result = new FizzBuzzResult();

        for(int i = start; i <= end; i++) {
            if(i != start) buffer.append(" ");

            String element = null;

            boolean divBy3 = i % 3 == 0;
            boolean divBy5 = i % 5 == 0;

            if( (""+i).contains("3") ) {
                element = "luck";
                result.incrementLuckCount();
            }
            else if(divBy3 && divBy5) {
                element = "fizzbuzz";
                result.incrementFizzBuzzCount();
            }
            else if(divBy3) {
                element = "fizz";
                result.incrementFizzCount();
            }
            else if(divBy5) {
                element = "buzz";
                result.incrementBuzzCount();
            }
            else {
                element = ""+i;
                result.incrementNumberCount();
            }

            buffer.append(element);
        }

        result.setOutput( buffer.toString() );

        return result;

    }
}
