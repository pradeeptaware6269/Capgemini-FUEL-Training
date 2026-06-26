package Model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Employee {

	@Id
	private int eid;
	private String name;
	private String designation;
	@OneToMany
	private List<Account> li = new ArrayList<Account>();

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<Account> getLi() {
		return li;
	}

	public void setLi(ArrayList<Account> l1) {
		this.li = l1;
	}

}
