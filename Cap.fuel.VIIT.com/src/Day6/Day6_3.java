package Day6;

public class Day6_3 {
	int id;
	String name;
	String add;
	static int mark = 75;
	String clgName;

	public Day6_3(int id, String name, String add, String clgName) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
		this.clgName = clgName;
	}

	void update(int marks) {
		Day6_3.mark = marks;
	}

	void diaplay() {
		System.out.println("The Id of the Student :" + id);
		System.out.println("The Name of the Student is :" + name);
		System.out.println("The marks of the student is :" + mark);
		System.out.println("The clg nam eod the stident is :" + clgName);
	}

	public static void main(String[] args) {
		Day6_3 d = new Day6_3(10, "Ram Taware", "Satara", "Baramati College ");
		d.update(85);
		d.diaplay();
	}

}
