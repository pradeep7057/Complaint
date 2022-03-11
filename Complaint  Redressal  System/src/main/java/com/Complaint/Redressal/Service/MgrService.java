package com.Complaint.Redressal.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Complaint.Redressal.Model.Mgr;
import com.Complaint.Redressal.Repository.MgrRepository;
@Service
@Transactional
public class MgrService {

	
	@Autowired
	private MgrRepository mgrepository;
	
	public List<Mgr> getMgrs() {
		// TODO Auto-generated method stub
		return mgrepository.findAll();
	}

	public Mgr saveMgr(Mgr mgr) {
		return mgrepository.save(mgr);
		
	}

	public List<Mgr> saveMgrs(List<Mgr> mgrs) {
		return mgrepository.saveAll(mgrs);
	
	}
	
	public Mgr get(Integer MGR_ID) {
		// TODO Auto-generated method stub
		return mgrepository.findById(MGR_ID).get();
	}

	public void save(Mgr mgr) {
		mgrepository.save(mgr);
		
	}	    

    public void delete(Integer MGR_ID) {
    	mgrepository.deleteById(MGR_ID);
    }

}