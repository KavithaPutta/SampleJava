package forloop;

public class PrintNumbers {
	public void numbers() {
		for(int i=1;i<=10;i++) {
			System.out.println("Print Numbers:"+i);
		}
	}

	public static void main(String[] args) {
		PrintNumbers obj=new PrintNumbers();
		obj.numbers();
		

	}

}
