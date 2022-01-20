package com.example.adaptor.adaptor;

import com.example.adaptor.adaptor.model.IndiaPaymentAdaptor;
import com.example.adaptor.adaptor.model.UsdPayment;
import com.example.adaptor.adaptor.repo.PaymentAdaptor;
import com.example.adaptor.adaptor.repo.Payment;

public class AdaptorApplication {

	public static void main(String[] args) {
		Payment payment1 = new UsdPayment(100);
		printInfo(payment1);

		Payment payment2 = new UsdPayment(200);
		printInfo(payment2);

		/**
		 * Payment is converted from USD 100.00 to INR 7500.00/-
		 * Payment is converted from USD 200.00 to INR 15000.00/-
		 */
	}

	private static void printInfo(Payment payment) {
		PaymentAdaptor adaptor = new IndiaPaymentAdaptor(payment);
		System.out.println(String.format("Payment is converted from %s %.2f to %s %.2f/-", payment.getCurrency(), payment.getAmount(), adaptor.getCurrency(), adaptor.getAmount()));
	}
}
