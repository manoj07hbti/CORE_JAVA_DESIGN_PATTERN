package com.example.cor.chainofresponsibility;

public class ChainOfResponsibilityApplication {

	public static void main(String[] args) {

		AtmDispenseChain atmDispenseChain = new AtmDispenseChain();
		printInfo(atmDispenseChain, 10); // cannot dispense

		printInfo(atmDispenseChain, 100);
		printInfo(atmDispenseChain, 300);

		printInfo(atmDispenseChain, 500);
		printInfo(atmDispenseChain, 1500);

		printInfo(atmDispenseChain, 2000);
		printInfo(atmDispenseChain, 6000);

		printInfo(atmDispenseChain, 3600);
		printInfo(atmDispenseChain, 9900);
	}

	private static void printInfo(AtmDispenseChain atmDispenseChain, int amount) {

		System.out.println(String.format("Dispense INR %d/-", amount));
		atmDispenseChain.dispense(amount); // cannot dispense
		System.out.println();
	}
}
