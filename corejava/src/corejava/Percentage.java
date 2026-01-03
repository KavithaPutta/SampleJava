package corejava;

public class Percentage {
	static int marks1=78;
	static int marks2=85;
	static int marks3=90;
	public static void total() {
		System.out.println("finds total:"+(marks1+marks2+marks3));
	}
	public static void percentage() {
		total();
		System.out.println("percentage:"+(marks1+marks2+marks3/300)*100);
	}
	

	public static void main(String[] args) {
		percentage();
		

	}

}
