package com.example.adaptor.adaptor.model;

import com.example.adaptor.adaptor.repo.PaymentAdaptor;
import com.example.adaptor.adaptor.repo.Payment;

public class IndiaPaymentAdaptor implements PaymentAdaptor {

    private Payment payment;

    public IndiaPaymentAdaptor(Payment payment) {
        this.payment = payment;
    }

    @Override
    public double getAmount() {
        return payment.getAmount() * 75;
    }

    @Override
    public String getCurrency() {
        return "INR";
    }
}
