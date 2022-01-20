package com.example.di.di.injector;

import com.example.di.di.consumer.Consumer;
import com.example.di.di.consumer.MessageServiceConsumer;
import com.example.di.di.impl.SmsMessageService;

public class SmsServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MessageServiceConsumer(new SmsMessageService());
    }
}
