package tn.esprit.server;

import java.util.Date;

public class ChatMessage {
	private String message;
	private String sender;
	private Date received;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public Date getReceived() {
		return received;
	}
	public void setReceived(Date received) {
		this.received = received;
	}
	@Override
	public String toString() {
		return "ChatMessage [message=" + message + ", sender=" + sender
				+ ", received=" + received + "]";
	}
 
	// getter, setter, toString omitted..
	
}