package whileloop;

public class Palindrome {
       public static void checkPalindrome(int num) {
	        int temp = num;
	        int reverse = 0;
	        while (num > 0) {
	        	int digit = num % 10;
	        reverse = reverse * 10 + digit;
	        num = num / 10;
	        }
	        if (temp == reverse) {
	            System.out.println("Palindrome number");
	        } else {
	            System.out.println("NOT a Palindrome number");
	        }
	    }
	public static void main(String[] args) {
		checkPalindrome(121);

	}

}
