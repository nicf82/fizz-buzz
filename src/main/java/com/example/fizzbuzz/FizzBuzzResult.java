package com.example.fizzbuzz;


public class FizzBuzzResult {

    private int fizzCount = 0;
    private int buzzCount = 0;
    private int fizzBuzzCount = 0;
    private int luckCount = 0;
    private int numberCount = 0;

    private String output;

    public int getFizzCount() {
        return fizzCount;
    }

    public void incrementFizzCount() {
        this.fizzCount++;
    }

    public int getBuzzCount() {
        return buzzCount;
    }

    public void incrementBuzzCount() {
        this.buzzCount++;
    }

    public int getFizzBuzzCount() {
        return fizzBuzzCount;
    }

    public void incrementFizzBuzzCount() {
        this.fizzBuzzCount++;
    }

    public int getLuckCount() {
        return luckCount;
    }

    public void incrementLuckCount() {
        this.luckCount++;
    }

    public int getNumberCount() {
        return numberCount;
    }

    public void incrementNumberCount() {
        this.numberCount++;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String toOutputFormattedString() {
        return getOutput() + "\n" +
                "fizz: " + getFizzCount() + "\n" +
                "buzz: " + getBuzzCount() + "\n" +
                "fizzbuzz: " + getFizzBuzzCount() + "\n" +
                "luck: " + getLuckCount() + "\n" +
                "number: " + getNumberCount();
    }
}
