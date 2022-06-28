package com.pulsarProducer;



import org.apache.pulsar.client.api.CompressionType;
import org.apache.pulsar.client.api.MessageId;
import org.apache.pulsar.client.api.Producer;
import org.apache.pulsar.client.api.PulsarClient;
import org.apache.pulsar.client.api.PulsarClientException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PulsarProducer {
	private final String mServiceUrl;
	private final String mTopicName;
	private Producer<byte[]> mProducer;
	private final Logger mLogger=LoggerFactory.getLogger(PulsarProducer.class);
	
	public PulsarProducer( String serviceUrl, String topic) {
		this.mServiceUrl=serviceUrl;
		this.mTopicName=topic;
	}
	
	private PulsarClient initClient() throws PulsarClientException{
		return PulsarClient.builder().serviceUrl(mServiceUrl).build();  // pulsor client initialization
	}
	
	public void init() throws PulsarClientException{
		mLogger.info("Instantiating producer ..........");
		
		mProducer = initClient().newProducer().topic(mTopicName).compressionType(CompressionType.LZ4).create(); // producer is intialized
	}
	
	public void send(String msg) {
		mLogger.info("Producer sending message : " );
		try {
			byte[] msgBytes = msg.getBytes();
			MessageId msgId = mProducer.send(msgBytes);
		}
		catch(PulsarClientException e) {
			mLogger.info("Producer message error : "+ e.getMessage());
		}
	}
	
	public void close() throws PulsarClientException{  // producer is closed 
		mProducer.close();
		mLogger.info("Producer is closed ");
	}
	
	
	
}
