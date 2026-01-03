package elseif;

public class VowelorConsonant {
	public String isConsonant(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			return "it is vowel";
		}
		else {
			return "it is Consonant";
		}
	}

	public static void main(String[] args) {
		VowelorConsonant obj=new VowelorConsonant();
		System.out.println(obj. isConsonant('a'));

	}

}
