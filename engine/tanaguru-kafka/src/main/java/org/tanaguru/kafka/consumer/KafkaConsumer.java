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
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.messaging.Message;

/**
 *
 * @author tanaguru
 */
public class KafkaConsumer {
    private static final String CONFIG = "/consumer_context.xml";
	private static Random rand = new Random();
	@SuppressWarnings({ "unchecked", "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		final ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(CONFIG, KafkaConsumer.class);
		ctx.start();
		final QueueChannel channel = ctx.getBean("inputFromKafka", QueueChannel.class);
		Message msg;		
		while((msg = channel.receive()) != null) {
			HashMap map = (HashMap)msg.getPayload();
			Set<Map.Entry> set = map.entrySet();
			for (Map.Entry entry : set) {
				String topic = (String)entry.getKey();
				System.out.println("Topic:" + topic);
				ConcurrentHashMap<Integer,List<byte[]>> messages = (ConcurrentHashMap<Integer,List<byte[]>>)entry.getValue();
				Collection<List<byte[]>> values = messages.values();
				for (Iterator<List<byte[]>> iterator = values.iterator(); iterator.hasNext();) {
					List<byte[]> list = iterator.next();
					for (byte[] object : list) {
						String message = new String(object);
						System.out.println("\tMessage: " + message);
					}
					
				}
			
			}
			
		}
		
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ctx.close();
	}
}
