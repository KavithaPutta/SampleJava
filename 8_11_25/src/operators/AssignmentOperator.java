package operators;

public class AssignmentOperator {
	public void data() {
		int a = 10;   
        System.out.println("Initial Value of a:"+a);
        a+=5;
        System.out.println("After a+=5:"+a);
        a-=5;
        System.out.println("After a-=5:"+a);
        a*=6;
        System.out.println("After a*=5:"+a);
        a/=5;
        System.out.println("After a/=5:"+a);
        a%=4;
        System.out.println("After a%=5:"+a);
        }

	public static void main(String[] args) {
		AssignmentOperator obj=new AssignmentOperator();
		obj.data();
		}
}
