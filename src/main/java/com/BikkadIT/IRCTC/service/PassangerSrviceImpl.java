package com.BikkadIT.IRCTC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.BikkadIT.IRCTC.model.Passanger;
import com.BikkadIT.IRCTC.model.Ticket;
import com.BikkadIT.IRCTC.repository.PassangerRepository;
import com.BikkadIT.IRCTC.repository.TicketRepository;

@Service
public class PassangerSrviceImpl implements PassangerServiceI {

	@Autowired
	private PassangerRepository passangerRepository;
	
	@Autowired
	private TicketRepository ticketRepository;

	@Override
	public Ticket BookTicket(Passanger psng) {
		Passanger save = passangerRepository.save(psng);
        int fid = save.getFid();
		
		Ticket ticket = ticketRepository.findById(fid).get();
		return ticket;
	}

	}
