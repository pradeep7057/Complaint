package com.Complaint.Redressal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Complaint.Redressal.Model.Cust;

@Repository
public interface CustRepository extends JpaRepository<Cust,Integer>{

}
