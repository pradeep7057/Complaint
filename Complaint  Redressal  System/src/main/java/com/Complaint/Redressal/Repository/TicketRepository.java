package com.Complaint.Redressal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Complaint.Redressal.Model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Integer> {

}
