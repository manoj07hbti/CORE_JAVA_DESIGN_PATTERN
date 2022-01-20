package com.example.di.di;

import com.example.di.di.consumer.Consumer;
import com.example.di.di.injector.EmailServiceInjector;
import com.example.di.di.injector.MessageServiceInjector;
import com.example.di.di.injector.SmsServiceInjector;

public class DiApplication {

	public static void main(String[] args) {

		String message = "Hello World!";
		String email = "message@example.com";
		String phone = "9876543210";

		MessageServiceInjector injector = null;
		Consumer app = null;

		//Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(message, email);

		//Send SMS
		injector = new SmsServiceInjector();
		app = injector.getConsumer();
		app.processMessages(message, phone);

		/**
		 * Email sent to message@example.com with Message: Hello World!
		 * SMS sent to 9876543210 with Message: Hello World!
		 */
	}

}
