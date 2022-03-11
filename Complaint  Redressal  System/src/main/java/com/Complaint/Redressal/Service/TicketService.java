package com.Complaint.Redressal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Complaint.Redressal.Model.Ticket;
import com.Complaint.Redressal.Repository.TicketRepository;

@Service
@Transactional
public class TicketService {

	@Autowired
	private TicketRepository ticketRepository;
	
	public List<Ticket> getTickets(){
		return ticketRepository.findAll();
	}
		
	public Ticket saveTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
			
	}

	public List<Ticket> saveTickets(List<Ticket> tickets) {
		return ticketRepository.saveAll(tickets);
	}
	public Ticket get(Integer T_NO) {
		return ticketRepository.findById(T_NO).get();
	}
    public void save(Ticket ticket) {
    	ticketRepository.save(ticket);
	}	    

	 public void delete(Integer T_NO) {
		 ticketRepository.deleteById(T_NO);
	  }
	}

