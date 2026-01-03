package patterns;

public class Square {
	public static void SquarePattern(int num) {
		for (int i = 1; i <= num; i++) {          
            for (int j = 1; j <= num; j++) {      
                System.out.print("* ");
            }
            System.out.println();
        }
	}
	public static void main(String[] args) {
		SquarePattern(5);
		}
	    	
}
