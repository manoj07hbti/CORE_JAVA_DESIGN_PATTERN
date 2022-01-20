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

		/**
		 * Dispense INR 10/-
		 * Please enter number in multiplication of 100.
		 *
		 * Dispense INR 100/-
		 * Dispensing 1 number of INR 100 notes
		 *
		 * Dispense INR 300/-
		 * Dispensing 3 number of INR 100 notes
		 *
		 * Dispense INR 500/-
		 * Dispensing 1 number of INR 500 notes
		 *
		 * Dispense INR 1500/-
		 * Dispensing 3 number of INR 500 notes
		 *
		 * Dispense INR 2000/-
		 * Dispensing 1 number of INR 2000 notes
		 *
		 * Dispense INR 6000/-
		 * Dispensing 3 number of INR 2000 notes
		 *
		 * Dispense INR 3600/-
		 * Dispensing 1 number of INR 2000 notes
		 * Dispensing 3 number of INR 500 notes
		 * Dispensing 1 number of INR 100 notes
		 *
		 * Dispense INR 9900/-
		 * Dispensing 4 number of INR 2000 notes
		 * Dispensing 3 number of INR 500 notes
		 * Dispensing 4 number of INR 100 notes
		 *
		 */
	}

	private static void printInfo(AtmDispenseChain atmDispenseChain, int amount) {

		System.out.println(String.format("Dispense INR %d/-", amount));
		atmDispenseChain.dispense(amount); // cannot dispense
		System.out.println();
	}
}
