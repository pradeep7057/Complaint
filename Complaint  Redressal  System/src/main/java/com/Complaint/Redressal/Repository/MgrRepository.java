package com.Complaint.Redressal.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Complaint.Redressal.Model.Mgr;

@Repository
public interface MgrRepository extends JpaRepository<Mgr,Integer>{

}