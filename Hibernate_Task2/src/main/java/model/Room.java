package model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Room {
	@Id
	private int rid;
	private String rname;

	@OneToOne
	@JoinColumn(name = "pid")
	private Patient patient;

//	@ManyToMany
//	private List<Patient> p = new ArrayList<Patient>();

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

//	public List<Patient> getP() {
//		return p;
//	}
//
//	public void setP(List<Patient> p) {
//		this.p = p;
//	}

	public Room(int rid, String rname) {

		this.rid = rid;
		this.rname = rname;
	}

	public Room() {

	}

}
