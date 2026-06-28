package model;

import java.util.ArrayList;
import java.util.List;

import Model.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {
	@Id
	private int cid;

	private String cname;
	@ManyToMany
	List<Student> lst = new ArrayList<Student>();

	public Course(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Student> getLst() {
		return lst;
	}

	public void setLst(List<Student> lst) {
		this.lst = lst;
	}

}
