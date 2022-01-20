package com.example.di.di.consumer;

import com.example.di.di.consumer.Consumer;
import com.example.di.di.repo.MessageService;

public class MessageServiceConsumer implements Consumer {

    private MessageService service;

    public MessageServiceConsumer(MessageService service) {
        this.service = service;
    }

    @Override
    public void processMessages(String message, String receiver) {
        service.sendMessage(message, receiver);
    }
}
