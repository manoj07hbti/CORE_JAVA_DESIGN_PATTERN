package com.example.cor.chainofresponsibility.model;

public interface DispenseChain {
    void nextChain(DispenseChain dispenseChain);
    void dispense(Payment payment);
}
