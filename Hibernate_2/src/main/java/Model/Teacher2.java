package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher2 {
	@Id
	int tid;
	String tname;
	String tadd;
	String tdep;

	public String getTdep() {
		return tdep;
	}

	public void setTdep(String tdep) {
		this.tdep = tdep;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTadd() {
		return tadd;
	}

	public void setTadd(String tadd) {
		this.tadd = tadd;
	}

}
