package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Locker {
	@Id
	private int lid;
	private String location;
	@OneToOne
	@JoinColumn(name = "pid")
	private Person per;

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Person getPer() {
		return per;
	}

	public void setPer(Person per) {
		this.per = per;
	}

}
