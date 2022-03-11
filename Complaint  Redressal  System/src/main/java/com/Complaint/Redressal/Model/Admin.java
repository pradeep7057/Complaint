package com.Complaint.Redressal.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADMIN")
public class Admin {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int admn_ID;
	
	@Column(name="admn_Name")
	private String admnName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;

	public Admin() {
		super();
	}

	public Admin(int admn_ID, String admnName, String email, String password) {
		super();
		this.admn_ID = admn_ID;
		this.admnName = admnName;
		this.email = email;
		this.password = password;
	}

	public int getAdmn_ID() {
		return admn_ID;
	}

	public void setAdmn_ID(int admn_ID) {
		this.admn_ID = admn_ID;
	}

	public String getAdmnName() {
		return admnName;
	}

	public void setAdmnName(String admnName) {
		this.admnName = admnName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [admn_ID=" + admn_ID + ", admnName=" + admnName + ", email=" + email + ", password=" + password
				+ "]";
	}
	
	
}
