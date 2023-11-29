package com.BikkadIT.IRCTC.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket {

    @Id
	private int tid;
	
	private String ticketStatus;
	
	private Double ticketPrice;

	@Override
	public String toString() {
		return "Ticket [tid=" + tid + ", ticketStatus=" + ticketStatus + ", ticketPrice=" + ticketPrice + "]";
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public Double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	
}
