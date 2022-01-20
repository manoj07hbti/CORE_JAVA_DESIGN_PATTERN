package com.example.cor.chainofresponsibility.model;

public class DispenseTwoThousand implements DispenseChain {

    private static int TWO_THOUSANDS = 2000;
    private DispenseChain dispenseChain;

    @Override
    public void nextChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispense(Payment payment) {
        if (payment.getAmount() >= TWO_THOUSANDS) {
            int notes = payment.getAmount() / TWO_THOUSANDS;
            int remainder = payment.getAmount() % TWO_THOUSANDS;
            System.out.println(String.format("Dispensing %d number of INR 2000 notes", notes));
            if (remainder != 0) {
                dispenseChain.dispense(new Payment(remainder));
            }
        }
        else {
            dispenseChain.dispense(payment);
        }
    }
}
