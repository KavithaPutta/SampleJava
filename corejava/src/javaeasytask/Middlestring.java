package javaeasytask;

public class Middlestring {

	public static void main(String[] args) {
		String str="Kavitha";
		int length=str.length();
		if(length%2==0) {
			char ch1=str.charAt(length/2-1);
			char ch2=str.charAt(length/2);
			System.out.println(""+ch1+ch2);
		}
		else {
			char ch=str.charAt(length/2);
			System.out.println(ch);
		}

	}

}
