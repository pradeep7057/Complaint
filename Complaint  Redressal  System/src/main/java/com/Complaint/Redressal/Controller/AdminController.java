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

import com.Complaint.Redressal.Model.Admin;
import com.Complaint.Redressal.Service.AdminService;
@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/admins")
	public List<Admin> findAllAdmins(){
		return adminService.getAdmins();
		
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/admins/{admn_ID}")
	public ResponseEntity<Admin> get(@PathVariable Integer admn_ID) {
	    try {
	    	Admin admin = adminService.get(admn_ID);
	        return new ResponseEntity<Admin>(admin, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
	    }      
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/updateadmins/{admn_ID}")
	public ResponseEntity<?> update(@RequestBody Admin admin, @PathVariable Integer admn_ID) {
	    try {
	    	Admin existAdmin = adminService.get(admn_ID);
	    	adminService.save(admin);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/deleteadmins/{admn_ID}")
	public void delete(@PathVariable Integer admn_ID) {
		adminService.delete(admn_ID);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/addadmins")
	public void add(@RequestBody 	Admin admin) {
		adminService.save(admin);
	}
		

}
