package switchcase;

public class Number {
	public void Helplinenumber(int num) {
		switch(num) {
		case 100:
			System.out.println("It is Police");break;
		case 101:
			System.out.println("It is fire Station");break;
		case 108:
			System.out.println("It is Ambulance");break;
		case 103:
			System.out.println("It is traffic Police");break;
		case 104:
			System.out.println("It is state level helpline for health");
		}
	}
	public static void main(String[] args) {
		Number obj=new Number();
		obj.Helplinenumber(108);

	}

}
