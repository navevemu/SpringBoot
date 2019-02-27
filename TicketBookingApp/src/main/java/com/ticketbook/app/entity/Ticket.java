package com.ticketbook.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Ticket")
public class Ticket {
	
	@Id
	@Column(name="ticketId")
	@GeneratedValue
	private int ticketId;
	@Column(name=("passengerName"))
	private String passengerName;
	@Column(name="source")
	private String source;
	@Column(name="destination")
	private String destination;
	@Column(name="dateOfBooking")
	private Date dateOfBooking;
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDateOfBooking() {
		return dateOfBooking;
	}
	public void setDateOfBooking(Date dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", passengerName=" + passengerName + ", source=" + source
				+ ", destination=" + destination + ", dateOfBooking=" + dateOfBooking + "]";
	}
	
}

