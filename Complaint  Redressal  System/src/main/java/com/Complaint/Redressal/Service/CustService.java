package com.Complaint.Redressal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Complaint.Redressal.Model.Cust;
import com.Complaint.Redressal.Repository.CustRepository;

@Service
@Transactional
public class CustService {

	@Autowired
	private CustRepository custrepository;
	
	public Cust saveCust(Cust cust) {
		return custrepository.save(cust);
		
	}

	public List<Cust> saveCusts(List<Cust> custs) {
		return custrepository.saveAll(custs);
	
	}
	public List<Cust> getCusts(){
		return custrepository.findAll();
		
	}

	public Cust get(Integer cust_ID) {
		// TODO Auto-generated method stub
		return custrepository.findById(cust_ID).get();
	}

	public void save(Cust cust) {
		custrepository.save(cust);
		
	}	    

    public void delete(Integer cust_ID) {
    	custrepository.deleteById(cust_ID);
    }
    

}