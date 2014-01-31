package com.airlinemgmt.jms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Hashtable;

import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.naming.Context;
import javax.naming.InitialContext;

public class FlightStatusUpdatePublisher {
	public static void main(String[] args) {
		new FlightStatusUpdatePublisher().publish();
	}

	public void publish() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			final Hashtable jndiProperties = new Hashtable();
			jndiProperties.put(Context.URL_PKG_PREFIXES,
					"org.jboss.ejb.client.naming");
			jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,
					"org.jboss.naming.remote.client.InitialContextFactory");
			jndiProperties.put(Context.PROVIDER_URL, "remote://localhost:4447");
			jndiProperties.put(Context.SECURITY_PRINCIPAL, "administrator");
			jndiProperties.put(Context.SECURITY_CREDENTIALS, "password");
			jndiProperties.put("jboss.naming.client.ejb.context", true);

			InitialContext context = new InitialContext(jndiProperties);
			// Strings for JNDI names
			String factoryName = "jms/RemoteConnectionFactory";
			String topicName = "jms/topic/test";
			// Create an initial context.
			/*
			 * Properties props = new Properties();
			 * props.put(Context.INITIAL_CONTEXT_FACTORY,
			 * "org.jboss.naming.remote.client.InitialContextFactory");
			 * props.put(Context.PROVIDER_URL, "remote://localhost:4447");
			 * props.put(Context.SECURITY_PRINCIPAL, "administrator");
			 * props.put(Context.SECURITY_CREDENTIALS, "password");
			 * props.put("jboss.naming.client.ejb.context", true);
			 * InitialContext context = new InitialContext(props);
			 */

			TopicConnectionFactory factory = (TopicConnectionFactory) context
					.lookup(factoryName);
			Topic topic = (Topic) context.lookup(topicName);
			context.close();
			// Create JMS objects
			TopicConnection connection = factory.createTopicConnection(
					"administrator", "password");
			TopicSession session = connection.createTopicSession(false,
					Session.AUTO_ACKNOWLEDGE);
			TopicPublisher publisher = session.createPublisher(topic);
			// Send messages
			System.out
					.println("Enter message of flight status update to send ");
			String messageText = null;
			while (true) {
				messageText = reader.readLine();
				if ("quit".equalsIgnoreCase(messageText)) {
					break;
				}
				TextMessage message = session.createTextMessage(messageText);
				publisher.publish(message);
			}
			// Exit
			System.out.println("Publishing the updated flight status...");
			reader.close();
			connection.close();
			System.out.println("Flight Status published");
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}