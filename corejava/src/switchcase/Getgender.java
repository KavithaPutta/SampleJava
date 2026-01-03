package switchcase;

public class Getgender {
	public void getGender(String Gender) {
		switch(Gender) {
		case "male":
			System.out.println("Gender is Male");
			break;
		case "Female":
			System.out.println("Gender is female");
			break;
		case "Others":
			System.out.println("Others");
			break;
			default:
				System.out.println("not a valid gender");
				break;
				
	}
	}

	public static void main(String[] args) {
		Getgender obj=new Getgender();
		obj.getGender("Female");
		
		}

	}


