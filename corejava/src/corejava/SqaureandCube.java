package corejava;

public class SqaureandCube {
	static int num=5;
	public static int square() {
		System.out.println(num*num);
		return num*num;
		
	}
	public static void cube() {
		square();
		System.out.println(num*num*num);
	}

	public static void main(String[] args) {
		cube();
		

	}

}
