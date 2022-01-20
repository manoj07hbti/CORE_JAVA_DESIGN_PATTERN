package com.example.cor.chainofresponsibility.model;

public class DispenseHundred implements DispenseChain {

    private static int HUNDRED = 100;
    private DispenseChain dispenseChain;

    @Override
    public void nextChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispense(Payment payment) {
        if (payment.getAmount() >= HUNDRED) {
            int notes = payment.getAmount() / HUNDRED;
            int remainder = payment.getAmount() % HUNDRED;
            System.out.println(String.format("Dispensing %d number of INR 100 notes", notes));
            if (remainder != 0) {
                dispenseChain.dispense(new Payment(remainder));
            }
        }
        else {
            dispenseChain.dispense(payment);
        }
    }
}
