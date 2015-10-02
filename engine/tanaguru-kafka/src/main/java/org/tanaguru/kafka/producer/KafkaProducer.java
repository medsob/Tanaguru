/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tanaguru.kafka.producer;

import java.util.Random;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

/**
 *
 * @author tanaguru
 */
public class KafkaProducer {
    private static final String CONFIG = "/context.xml";
	private static Random rand = new Random();
	public static void main(String[] args) {
		final ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(CONFIG, KafkaProducer.class);
		ctx.start();
		final MessageChannel channel = ctx.getBean("inputToKafka", MessageChannel.class);
		for (int i = 0; i < 100; i++) {
			channel.send(MessageBuilder.withPayload("Message-" + rand.nextInt()).setHeader("messageKey", String.valueOf(i)).setHeader("topic", "test").build());
		}
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ctx.close();
	}
}
