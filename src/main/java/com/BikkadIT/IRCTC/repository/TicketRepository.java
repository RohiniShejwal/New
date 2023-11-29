package com.BikkadIT.IRCTC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.IRCTC.model.Ticket;


public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
