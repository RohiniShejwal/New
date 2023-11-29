package com.BikkadIT.IRCTC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.IRCTC.model.Passanger;
import com.BikkadIT.IRCTC.model.Ticket;
import com.BikkadIT.IRCTC.service.PassangerServiceI;

@RestController
public class PassangerController {

	@Autowired
	private PassangerServiceI passangerServiceI;
	
	// Save Data
	 
		@PostMapping(value = "/SaveData", consumes = "application/json")
		public ResponseEntity<Ticket> bookTicket(@RequestBody Passanger psng) {
			 Ticket bookTicket = passangerServiceI.BookTicket(psng);
			return new ResponseEntity<Ticket>(bookTicket, HttpStatus.OK);
		}
		
	
}
