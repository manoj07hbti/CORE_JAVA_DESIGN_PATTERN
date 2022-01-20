package com.example.cor.chainofresponsibility;

import com.example.cor.chainofresponsibility.model.*;

public class AtmDispenseChain {

    private DispenseChain dispenseChain;

    public AtmDispenseChain() {
        this.dispenseChain = new DispenseTwoThousand();
        DispenseFiveHundred dispenseFiveHundred = new DispenseFiveHundred();
        DispenseHundred dispenseHundred = new DispenseHundred();
        this.dispenseChain.nextChain(dispenseFiveHundred);
        dispenseFiveHundred.nextChain(dispenseHundred);
    }

    public void dispense(int number) {
        if (number % 100 == 0) {
            dispenseChain.dispense(new Payment(number));
        }
        else {
            System.out.println("Please enter number in multiplication of 100.");
        }
    }
}
