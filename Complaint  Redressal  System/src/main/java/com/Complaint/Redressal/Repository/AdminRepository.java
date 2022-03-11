package com.Complaint.Redressal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Complaint.Redressal.Model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {

	

}
