package com.ticketbook.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticketbook.app.dao.TicketDao;
import com.ticketbook.app.entity.Ticket;

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

	public Optional<Ticket> getTicketById(int ticketId) {
		return ticketDao.findById(ticketId);
		
		
	}

	public  Ticket updateTicket(int ticketId,String destination) {
		 Optional<Ticket> o= ticketDao.findById(ticketId);
		 Ticket ticket =o.get();
		 ticket.setDestination(destination);
	      return	 ticketDao.save(ticket);
		
	}

	public String cancelTicket(int ticketId) {
		 ticketDao.deleteById(ticketId);
		 return "Success";
	}

	}
	


