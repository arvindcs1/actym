package GenericUtility;

import java.util.Random;

public class Java_Utility {

	/*
	 * this method is to get Random Number 
	 */
	public int getRandomNumber() {
		Random rd = new Random();
		int num = rd.nextInt(1000);
		return num;
		
	}
}
