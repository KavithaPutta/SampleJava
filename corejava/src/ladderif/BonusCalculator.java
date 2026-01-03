package ladderif;

public class BonusCalculator {
	public double calculateBonus(int experince,int rating,double salary) {
		if(experince>5 && rating>9 ) {
			return  0.50;
		}
		else if(experince>=3 && experince<=5 && rating<=9 && rating>7) {
			return 0.30;
		}
		else if(experince>=1 && experince<3 && rating<=7 && rating>=5) {
			return 0.10;
		}
		else {
			return 0.00;
		}
	}

	public static void main(String[] args) {
		 BonusCalculator obj=new  BonusCalculator();
		 System.out.println(obj.calculateBonus(5, 9,0.50));

	}

}
