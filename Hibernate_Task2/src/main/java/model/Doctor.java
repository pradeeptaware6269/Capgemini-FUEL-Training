package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Doctor {
	@Id
	private int did;
	private String dname;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	// Here we are Created the Default Constructor
//	public Doctor() {
//
//	}

	// Here we are Created the Parametries Constructor
	public Doctor(int did, String dname) {
		this.did = did;
		this.dname = dname;
	}

}
