package palyuhovich;

import java.util.Random;

public class Tree {
	private int appleNumber;
	
	public int graw(int n) {
		Random random = new Random();
		int apples = random.nextInt(n);
		appleNumber += apples;
		return apples;
	}
	
	public int shake() {
		int apples = (int)(Math.random() * appleNumber);
		appleNumber -= apples;
		return apples;
	}
}