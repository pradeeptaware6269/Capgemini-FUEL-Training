package model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	private int pid;
	private String pname;
	private double psalary;

	@ManyToMany
	List<Customer> lst = new ArrayList<Customer>();

	public Product(int pid, String pname, double psalary) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.psalary = psalary;
	}

	public List<Customer> getLst() {
		return lst;
	}

	public void setLst(List<Customer> lst) {
		this.lst = lst;
	}

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

	public double getPsalary() {
		return psalary;
	}

	public void setPsalary(double psalary) {
		this.psalary = psalary;
	}

}
