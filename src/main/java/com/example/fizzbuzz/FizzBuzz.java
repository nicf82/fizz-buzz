package com.example.fizzbuzz;


public class FizzBuzz {

    public static void main(String[] args) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.evaluate(1, 20);

        System.out.println( result );
    }

    public String evaluate(int start, int end) {

        StringBuilder buffer = new StringBuilder();

        for(int i = start; i <= end; i++) {
            if(i != start) buffer.append(" ");

            String element = null;

            boolean divBy3 = i % 3 == 0;
            boolean divBy5 = i % 5 == 0;

            if( (""+i).contains("3") ) {
                element = "luck";
            }
            else if(divBy3 && divBy5) {
                element = "fizzbuzz";
            }
            else if(divBy3) {
                element = "fizz";
            }
            else if(divBy5) {
                element = "buzz";
            }
            else {
                element = ""+i;
            }

            buffer.append(element);
        }

        return buffer.toString();

    }
}
