package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
	@Id
	private int pid;
	private String pname;
	private String padd;
	private int age;

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

	public String getPadd() {
		return padd;
	}

	public void setPadd(String padd) {
		this.padd = padd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
