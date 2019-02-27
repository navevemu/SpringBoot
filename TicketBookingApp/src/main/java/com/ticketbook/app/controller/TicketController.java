package com.ticketbook.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticketbook.app.entity.Ticket;
import com.ticketbook.app.service.TicketService;
	


@RestController
@RequestMapping(value="/tickets")
public class TicketController {
	
	@Autowired
	private TicketService ticketService;

	public TicketService getTicketService() {
		return ticketService;
	}

	public void setTicketService(TicketService ticketService) {
		this.ticketService = ticketService;
	}
	@PostMapping(value = "/create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
	 return   ticketService.createTicket(ticket);
		}

	@GetMapping(value="/getTicket/{ticketId}")
	public Optional<Ticket> getTicketById(@PathVariable("ticketId") int ticketId)
	{
		return ticketService.getTicketById(ticketId);
	}
	
	@PutMapping(value="/updatedestination/{ticketId}/{destination}")
	public Ticket updateTicket(@PathVariable("ticketId") int ticketId,@PathVariable("destination") String destination)
	{
		return ticketService.updateTicket(ticketId, destination);
	}
	
	@DeleteMapping(value="/cancelTicket/{ticketId}")
	public String cancelTicket(@PathVariable("ticketId") int ticketId)
	{
		return ticketService.cancelTicket(ticketId);
	}
	
	

}
