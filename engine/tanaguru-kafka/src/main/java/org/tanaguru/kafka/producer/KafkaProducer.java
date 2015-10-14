/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tanaguru.kafka.producer;

import com.yammer.metrics.Metrics;
import java.util.Random;
import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.kafka.support.KafkaHeaders;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;
import org.tanaguru.kafka.consumer.KafkaConsumer;

/**
 *
 * @author tanaguru
 */
@Component
public class KafkaProducer {

    private static final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);
    private static Random rand = new Random();

    @Autowired
    private MessageChannel inputToKafka;

    @PostConstruct
    public void initMethod() throws Exception {
        log.info("Bean constructed");
        Metrics.shutdown();
    }

    public void produceMessage(String[] args) {
        for (int i = 0; i < 100; i++) {
            inputToKafka.send(MessageBuilder.withPayload("Message-" + rand.nextInt()).setHeader(KafkaHeaders.MESSAGE_KEY, String.valueOf(i)).setHeader(KafkaHeaders.TOPIC, "messageExemple").build());
        }
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
