package com.example.strategy.strategy.model;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int number1, int number2) {
        return strategy.process(number1, number2);
    }
}
