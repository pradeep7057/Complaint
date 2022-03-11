package com.Complaint.Redressal.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="ENGR")
	public class Engr {


		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private  int ENGR_ID;
		@Column(name="ENGR_NAME")
		 private String ENGRNAME;
		
		@Column(name="PINCODE")
		private int PINCODE;
		
		@Column(name="MOBILE_NO")
		 private Long  MOBILENO;

		public Engr() {
		
		}

		public Engr(int eNGR_ID, String eNGRNAME, int pINCODE, Long mOBILENO) {
			super();
			ENGR_ID = eNGR_ID;
			ENGRNAME = eNGRNAME;
			PINCODE = pINCODE;
			MOBILENO = mOBILENO;
		}

		public int getENGR_ID() {
			return ENGR_ID;
		}

		public void setENGR_ID(int eNGR_ID) {
			ENGR_ID = eNGR_ID;
		}

		public String getENGRNAME() {
			return ENGRNAME;
		}

		public void setENGRNAME(String eNGRNAME) {
			ENGRNAME = eNGRNAME;
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
