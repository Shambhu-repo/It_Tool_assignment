package com.mainClass;

import org.apache.pulsar.client.api.PulsarClientException;

import com.pulsarProducer.PulsarProducer;

//@SpringBootApplication
public class ProducerMainClass {

	/*
	 * public static void main(String[] args) {
	 * SpringApplication.run(PulsorClientDemoApplication.class, args); }
	 *
	 */
	
	public static void main (String [] args) throws PulsarClientException {
	String serviceUrl = "pulsar://localhost:6651";
	String topicName = "test-topic";
	PulsarProducer producer = new PulsarProducer(serviceUrl,topicName); 
	producer.init();
	
	for (int i = 1;i<=5;i++) {
		String msg = "message number " + i;
		producer.send(msg);
	}
	producer.close();
	
	} 
		
	}

