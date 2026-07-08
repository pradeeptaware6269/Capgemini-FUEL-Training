package Day_4;

public class Day4_16_Encapsulation {
	private int sid;
	private String sname;
	private int marks;
	private String sdep;

	public Day4_16_Encapsulation(int sid, String sname, int marks, String sdep) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
		this.sdep = sdep;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getSdep() {
		return sdep;
	}

	public void setSdep(String sdep) {
		this.sdep = sdep;
	}

	public void displsy() {
		System.out.println("The Id of the Student is :" + sid);
		System.out.println("The name of the Student is :" + sname);
		System.out.println("the marks of the students is :" + marks);
		System.out.println("The department of the students is :" + sdep);

	}

	public static void main(String[] args) {
		Day4_16_Encapsulation s = new Day4_16_Encapsulation(0, null, 0, null);
		s.setSid(101);
		s.setSname("Pradeep");
		s.setMarks(66);
		s.setSdep("MCA IT");

		s.displsy();
	}

}
