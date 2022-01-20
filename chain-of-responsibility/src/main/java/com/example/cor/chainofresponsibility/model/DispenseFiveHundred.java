package com.example.cor.chainofresponsibility.model;

public class DispenseFiveHundred implements DispenseChain {

    private static int FIVE_HUNDRED = 500;
    private DispenseChain dispenseChain;

    @Override
    public void nextChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispense(Payment payment) {
        if (payment.getAmount() >= FIVE_HUNDRED) {
            int notes = payment.getAmount() / FIVE_HUNDRED;
            int remainder = payment.getAmount() % FIVE_HUNDRED;
            System.out.println(String.format("Dispensing %d number of INR 500 notes", notes));
            if (remainder != 0) {
                dispenseChain.dispense(new Payment(remainder));
            }
        }
        else {
            dispenseChain.dispense(payment);
        }
    }
}
