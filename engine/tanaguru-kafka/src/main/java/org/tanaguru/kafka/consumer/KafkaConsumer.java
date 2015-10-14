/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tanaguru.kafka.consumer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 *
 * @author tanaguru
 */
@Component
public class KafkaConsumer {

    private static final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);
//    @Autowired
//    @Qualifier("inputFromKafka")
//    QueueChannel channel;
//
//    public void consumeMessage() {
//        Message msg;
//        while ((msg = channel.receive()) != null) {
//            HashMap map = (HashMap) msg.getPayload();
//            Set<Map.Entry> set = map.entrySet();
//            for (Map.Entry entry : set) {
//                String topic = (String) entry.getKey();
//                System.out.println("Topic:" + topic);
//                ConcurrentHashMap<Integer, List<byte[]>> messages = (ConcurrentHashMap<Integer, List<byte[]>>) entry.getValue();
//                Collection<List<byte[]>> values = messages.values();
//                for (Iterator<List<byte[]>> iterator = values.iterator(); iterator.hasNext();) {
//                    List<byte[]> list = iterator.next();
//                    for (byte[] object : list) {
//                        String message = new String(object);
//                        System.out.println("\tMessage: " + message);
//                    }
//
//                }
//
//            }
//        }
//
//        try {
//            Thread.sleep(100000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    public void processMessage(Map<String, Map<Integer, List<byte[]>>> msgs) {
        for (Map.Entry<String, Map<Integer, List<byte[]>>> entry : msgs
                .entrySet()) {
            log.debug("Topic:" + entry.getKey());
            ConcurrentHashMap<Integer, List<byte[]>> messages = (ConcurrentHashMap<Integer, List<byte[]>>) entry
                    .getValue();
            log.debug("\n**** Partition: \n");
            Set<Integer> keys = messages.keySet();
            for (Integer i : keys) {
                log.debug("p:" + i);
            }
            log.debug("\n**************\n");
            Collection<List<byte[]>> values = messages.values();
            for (Iterator<List<byte[]>> iterator = values.iterator(); iterator
                    .hasNext();) {
                List<byte[]> list = iterator.next();
                for (byte[] object : list) {
                    String message = new String(object);
                    log.debug("Message: " + message);
                    try {
                        System.out.println(message);
                    } catch (Exception e) {
                        log.error(String.format("Failed to process message %s",
                                message));
                    }
                }
            }

        }
    }

}
