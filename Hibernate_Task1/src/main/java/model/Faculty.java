package model;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Faculty {

	@Id
	private int fid;
	private String fname;

	@OneToMany()
	private List<Course> courses = new ArrayList<>();

	public Faculty() {
	}

	public Faculty(int fid, String fname) {
		this.fid = fid;
		this.fname = fname;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

}