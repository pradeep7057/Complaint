package com.Complaint.Redressal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Complaint.Redressal.Model.Admin;
import com.Complaint.Redressal.Repository.AdminRepository;
@Service
@Transactional
public class AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	public Admin saveAdmin(Admin admin) {
		return adminRepository.save(admin);
		
	}

	public List<Admin> saveAdmins(List<Admin> admins) {
		return adminRepository.saveAll(admins);
	
	}
	public List<Admin> getAdmins(){
		return adminRepository.findAll();
		
	}

	public Admin get(Integer admn_ID) {
		// TODO Auto-generated method stub
		return adminRepository.findById(admn_ID).get();
	}

	public void save(Admin admin) {
		adminRepository.save(admin);
		
	}	    

    public void delete(Integer admn_ID) {
    	adminRepository.deleteById(admn_ID);
    }
    

}
