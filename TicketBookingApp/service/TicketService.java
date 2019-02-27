package com.ticketbook.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticketbook.dao.TicketDao;
import com.ticketbook.entity.Ticket;

@Service
public class TicketService {
	
	@Autowired
	private TicketDao ticketDao;

	public TicketDao getTicketDao() {
		return ticketDao;
	}

	public void setTicketDao(TicketDao ticketDao) {
		this.ticketDao = ticketDao;
	}

	public Ticket createTicket(Ticket ticket) {
		
		return ticketDao.save(ticket);
	}

	public Ticket getTicketById(int ticketId) {
		Object obj= ticketDao.findById(ticketId);
		return (Ticket)obj;
		
	}

	}
	


