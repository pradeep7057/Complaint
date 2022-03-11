package com.Complaint.Redressal.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MGR")
public class Mgr {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  int MGR_ID;
	@Column(name="MGR_NAME")
    private String MGRNAME;
	@Column(name="PINCODE")
    private int PINCODE;
	@Column(name="MOBILE_NO")
    private Long  MOBILENO;
	public Mgr() {
		
	}
	public Mgr(int mGR_ID, String mGRNAME, int pINCODE, Long mOBILENO) {
		super();
		MGR_ID = mGR_ID;
		MGRNAME = mGRNAME;
		PINCODE = pINCODE;
		MOBILENO = mOBILENO;
	}
	public int getMGR_ID() {
		return MGR_ID;
	}
	public void setMGR_ID(int mGR_ID) {
		MGR_ID = mGR_ID;
	}
	public String getMGRNAME() {
		return MGRNAME;
	}
	public void setMGRNAME(String mGRNAME) {
		MGRNAME = mGRNAME;
	}
	public int getPINCODE() {
		return PINCODE;
	}
	public void setPINCODE(int pINCODE) {
		PINCODE = pINCODE;
	}
	public Long getMOBILENO() {
		return MOBILENO;
	}
	public void setMOBILENO(Long mOBILENO) {
		MOBILENO = mOBILENO;
	}
}