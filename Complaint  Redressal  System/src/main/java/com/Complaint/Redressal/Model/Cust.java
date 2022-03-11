package com.Complaint.Redressal.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUST")
public class Cust {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
    private int Cust_ID;
	
	@Column(name="Cust_Name")
	private String CustName;
	
	@Column(name="Address")
	private String Address;
	
	@Column(name="Pincode")
	private int Pincode;
	
	@Column(name="Mobile_no")
	private Long MobileNo;

	public Cust(int cust_ID, String custName, String address, int pincode, Long mobileNo) {
		super();
		Cust_ID = cust_ID;
		CustName = custName;
		Address = address;
		Pincode = pincode;
		MobileNo = mobileNo;
	}

	public Cust() {
		
	}

	public int getCust_ID() {
		return Cust_ID;
	}

	public void setCust_ID(int cust_ID) {
		Cust_ID = cust_ID;
	}

	public String getCustName() {
		return CustName;
	}

	public void setCustName(String custName) {
		CustName = custName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getPincode() {
		return Pincode;
	}

	public void setPincode(int pincode) {
		Pincode = pincode;
	}

	public Long getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		MobileNo = mobileNo;
	}
	
	
}
