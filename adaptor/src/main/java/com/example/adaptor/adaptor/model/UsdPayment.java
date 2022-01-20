package com.example.adaptor.adaptor.model;

import com.example.adaptor.adaptor.repo.Payment;

public class UsdPayment implements Payment {

    private double amount;

    public UsdPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String getCurrency() {
        return "USD";
    }
}
