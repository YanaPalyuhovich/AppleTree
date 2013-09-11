package palyuhovich;

import java.util.Random;

public class Tree {
	private int appleNumber;
	private int flowerNumber;
	
	public int grow(int n) {
		Random random = new Random();
		if (flowerNumber == 0) {
			int apples = random.nextInt(n);
			appleNumber += apples;
			return apples;
		} else {
			int apples = random.nextInt(flowerNumber + 1);
			appleNumber += apples;
			flowerNumber -= apples;
			return apples;
		}
	}
	
	public int shake() {
		int apples = (int)(Math.random() * appleNumber);
		appleNumber -= apples;
		return apples;
	}
	
	public int bloom(int n) {
		Random random = new Random();
		int flowers = random.nextInt(n);
		flowerNumber += flowers;
		return flowers;
	}
}