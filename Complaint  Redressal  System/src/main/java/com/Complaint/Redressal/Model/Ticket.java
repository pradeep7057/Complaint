package com.Complaint.Redressal.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TICKET")
public class Ticket {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int T_NO;
	
	@Column(name="cust_ID")
	private int cust_ID;
	
	@Column(name="mgr_ID")
	private int mgr_ID;
	
	@Column(name="engr_ID")
	private int engr_ID;
	
	@Column(name="pincode")
	private int  pincode;
	
	@Column(name="Complaint")
	private String Complaint;
	
	@Column(name="Status")
	private String Status;

	public Ticket() {
		
	}

	public Ticket(int t_NO, int cust_ID, int mgr_ID, int engr_ID, int pincode, String complaint, String status) {
		super();
		T_NO = t_NO;
		this.cust_ID = cust_ID;
		this.mgr_ID = mgr_ID;
		this.engr_ID = engr_ID;
		this.pincode = pincode;
		Complaint = complaint;
		Status = status;
	}

	public int getT_NO() {
		return T_NO;
	}

	public void setT_NO(int t_NO) {
		T_NO = t_NO;
	}

	public int getCust_ID() {
		return cust_ID;
	}

	public void setCust_ID(int cust_ID) {
		this.cust_ID = cust_ID;
	}

	public int getMgr_ID() {
		return mgr_ID;
	}

	public void setMgr_ID(int mgr_ID) {
		this.mgr_ID = mgr_ID;
	}

	public int getEngr_ID() {
		return engr_ID;
	}

	public void setEngr_ID(int engr_ID) {
		this.engr_ID = engr_ID;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getComplaint() {
		return Complaint;
	}

	public void setComplaint(String complaint) {
		Complaint = complaint;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	
	
	
	
	
}
