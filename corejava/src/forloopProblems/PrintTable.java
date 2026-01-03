package forloopProblems;

public class PrintTable {
	public void table(int num,int value) {
		System.out.println(num+"*"+value+"="+num*value);
	}

	public static void main(String[] args) {
		PrintTable obj=new PrintTable();
		for(int i=1;i<=10;i++) {
			obj.table(5, i);
		}

	}

}
