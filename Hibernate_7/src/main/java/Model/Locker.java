package Model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Locker {
	@Id
	private int accNo;
	private String accType;
	@OneToMany
	private List<Employee> l1 = new ArrayList<Employee>();

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public ArrayList<Employee> getL1() {
		return (ArrayList<Employee>) l1;
	}

	public void setL1(ArrayList<Employee> l1) {
		this.l1 = l1;
	}

}
