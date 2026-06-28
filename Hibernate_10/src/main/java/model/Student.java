package model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	private int sid;
	private String sname;
	private String smark;
	@ManyToMany
	List<Course> clst = new ArrayList<Course>();

	public Student(int sid, String sname, String smark) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smark = smark;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSmark() {
		return smark;
	}

	public void setSmark(String smark) {
		this.smark = smark;
	}

	public List<Course> getClst() {
		return clst;
	}

	public void setClst(List<Course> clst) {
		this.clst = clst;
	}

}
