package com.example.di.di.impl;

import com.example.di.di.repo.MessageService;

public class SmsMessageService implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("SMS sent to " + receiver + " with Message: " + message);
    }
}
