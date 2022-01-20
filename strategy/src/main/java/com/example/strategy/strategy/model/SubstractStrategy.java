package com.example.strategy.strategy.model;

public class SubstractStrategy implements Strategy {
    @Override
    public int process(int number1, int number2) {
        return number1 - number2;
    }
}
