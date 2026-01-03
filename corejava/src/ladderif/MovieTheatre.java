package ladderif;

public class MovieTheatre {
	public double getTicketPrice(int age) {
		if(age<5) {
			return 0.0;
		}
		else if(age>5 && age<12) {
			return 5.0;
		}
		else if(age>=13 && age<60) {
			return 10.0;
		}
		else {
			return 0.50;
		}
		
	}

	public static void main(String[] args) {
		MovieTheatre obj=new MovieTheatre();
		System.out.println(obj.getTicketPrice(57));

	}

}
