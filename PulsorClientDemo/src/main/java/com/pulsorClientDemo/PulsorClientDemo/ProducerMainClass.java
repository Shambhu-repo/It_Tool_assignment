package com.pulsorClientDemo.PulsorClientDemo;

import org.apache.pulsar.client.api.Producer;
import org.apache.pulsar.client.api.PulsarClientException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pulsarProducer.PulsarProducer;

//@SpringBootApplication
public class ProducerMainClass {

	/*
	 * public static void main(String[] args) {
	 * SpringApplication.run(PulsorClientDemoApplication.class, args); }
	 *
	 */
	
	public static void main (String [] args) throws PulsarClientException {
	String serviceUrl = "pulsar://localhost:6650";
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
