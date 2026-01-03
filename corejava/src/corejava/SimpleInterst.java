package corejava;

public class SimpleInterst {
	static int principal=5000;
	static int rate=5;
	static int time=2;
	public static void calculateInterst() {
		System.out.println("simpleInterst:" +(principal*rate*time)/100);
	}

	public static void main(String[] args) {
		calculateInterst();

	}

}
