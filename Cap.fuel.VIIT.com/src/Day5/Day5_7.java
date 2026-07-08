package Day5;

public class Day5_7 {
	public void disp() {
		System.out.println("Hello Ram");
	}

	public class Main extends Day5_7 {
		public void disp() {
			System.out.println("Hello sham ");
		}
	}

	public static void main(String[] args) {

		Day5_7 obj = new Day5_7();
		Main d = obj.new Main();
		d.disp();
	}

}
