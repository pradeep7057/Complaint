package com.Complaint.Redressal.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Complaint.Redressal.Model.Ticket;
import com.Complaint.Redressal.Service.TicketService;

@RestController
public class TicketController {

	@Autowired
	private TicketService ticketService;
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/tickets")
	public List<Ticket> findAllTickets(){
		return ticketService.getTickets();
}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/tickets/{T_NO}")
	public ResponseEntity<Ticket> get(@PathVariable Integer T_NO) {
	    try {
	    	Ticket ticket = ticketService.get(T_NO);
	        return new ResponseEntity<Ticket>(ticket, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Ticket>(HttpStatus.NOT_FOUND);
	    }      
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/updatecusts/{T_NO}")
	public ResponseEntity<?> update(@RequestBody Ticket ticket, @PathVariable Integer T_NO) {
	    try {
	    	Ticket existTicket = ticketService.get(T_NO);
	        ticketService.save(ticket);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/deletetickets/{T_NO}")
	public void delete(@PathVariable Integer T_NO) {
		ticketService.delete(T_NO);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/addtickets")
	public void add(@RequestBody 	Ticket ticket) {
		ticketService.save(ticket);
	}
		

}