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

import com.Complaint.Redressal.Model.Cust;
import com.Complaint.Redressal.Service.CustService;

@RestController
public class CustController {
	
	@Autowired
	private CustService custservice;
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/custs")
	public List<Cust> findAllCusts(){
		return custservice.getCusts();
		
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/custs/{Cust_ID}")
	public ResponseEntity<Cust> get(@PathVariable Integer Cust_ID) {
	    try {
	    	Cust cust = custservice.get(Cust_ID);
	        return new ResponseEntity<Cust>(cust, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Cust>(HttpStatus.NOT_FOUND);
	    }      
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/updatecusts/{Cust_ID}")
	public ResponseEntity<?> update(@RequestBody Cust cust, @PathVariable Integer Cust_ID) {
	    try {
	        Cust existCust = custservice.get(Cust_ID);
	        custservice.save(cust);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/deletecusts/{Cust_ID}")
	public void delete(@PathVariable Integer Cust_ID) {
		custservice.delete(Cust_ID);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/addcusts")
	public void add(@RequestBody 	Cust cust) {
		custservice.save(cust);
	}
		
}


