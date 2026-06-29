package model;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Patient {
	@Id
	private int pid;
	private String pname;

	@OneToMany
	private List<Doctor> lst = new ArrayList<Doctor>();

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Doctor> getLst() {
		return lst;
	}

	public void setLst(List<Doctor> lst) {
		this.lst = lst;
	}

	public Patient(int pid, String pname) {
		this.pid = pid;
		this.pname = pname;
	}

	public Patient() {

	}

}
