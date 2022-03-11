package com.Complaint.Redressal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Complaint.Redressal.Model.Engr;

@Repository
public interface EngrRepository extends JpaRepository<Engr,Integer> {

}
