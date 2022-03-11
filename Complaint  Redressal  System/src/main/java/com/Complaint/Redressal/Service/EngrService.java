package com.Complaint.Redressal.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Complaint.Redressal.Model.Engr;
import com.Complaint.Redressal.Repository.EngrRepository;

@Service
@Transactional
public class EngrService {

	@Autowired
	private EngrRepository Engrepository;
	
	public List<Engr> getEngrs() {
		// TODO Auto-generated method stub
		return Engrepository.findAll();
	}

	public Engr saveEngr(Engr engr) {
		return Engrepository.save(engr);
		
	}

	public List<Engr> saveEngrs(List<Engr> engrs) {
		return Engrepository.saveAll(engrs);
	
	}
		
	

	public Engr get(Integer ENGR_ID) {
		// TODO Auto-generated method stub
		return Engrepository.findById(ENGR_ID).get();
	}

	public void save(Engr engr) {
		Engrepository.save(engr);
		
	}	    

    public void delete(Integer ENGR_ID) {
    	Engrepository.deleteById(ENGR_ID);
    }


}
