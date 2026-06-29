package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Student {
	@Id
	private int sid;
	private String sname;
	private String sadd;
	private int marks;

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

	public String getSadd() {
		return sadd;
	}

	public void setSadd(String sadd) {
		this.sadd = sadd;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void display() {
		System.out.println("The Id of the Student is  :" + getSid());
		System.out.println("The Name of the Student is :" + getSname());
		System.out.println("The Address of the Student is :" + getSadd());
		System.out.println("The MArks of the Student is :" + getMarks());

	}

}
