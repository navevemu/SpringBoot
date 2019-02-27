package com.ticketbook.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.ticketbook.app.entity.Ticket;



public interface TicketDao extends CrudRepository<Ticket, Integer>{
	

}
