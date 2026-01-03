package javatask1;

public class Game {
	public static void showGameTitle() {
		System.out.println("Title:Welcome to Adventure Quest!");
	}
	public static void showGameRules() {
		System.out.println("Rules: 1. Collect coins 2. Avoid obstacles 3. Reach the goal");
	}
	public static void showLoadingScreen() {
		System.out.println("Loading game... Please wait");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showGameTitle();
		showGameRules();
		showLoadingScreen();
	}

}
