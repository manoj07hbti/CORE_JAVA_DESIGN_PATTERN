package com.example.di.di.impl;

import com.example.di.di.repo.MessageService;

public class EmailMessageService implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Email sent to " + receiver + " with Message: " + message);
    }
}
