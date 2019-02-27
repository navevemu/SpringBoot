package com.ticketbook.app;



import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ticketbook.app.entity.Ticket;
import com.ticketbook.app.service.TicketService;



@SpringBootApplication

public class TicketBookingAppApplication  implements CommandLineRunner{
	@Autowired
	private TicketService ticketService;
	@Autowired
	private DataSource dataSource;
	public static void main(String[] args) {
		ConfigurableApplicationContext c=SpringApplication.run(TicketBookingAppApplication.class, args);
		
	 
		
	}

	@Override
	public void run(String... args) throws Exception {

		Ticket t=new Ticket();
		t.setPassengerName("Naveen");
		t.setSource("Mumbai");
		t.setDestination("Bangalore");
		t.setDateOfBooking(new Date());
		ticketService.createTicket(t);
		
	}

}


