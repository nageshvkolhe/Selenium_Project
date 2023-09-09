package Project.Building_a_selenium_project;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomValue {

	public static void main(String args[]) {
//		String generatedString = RandomStringUtils.randomAlphabetic(10);
//
//		System.out.println(generatedString);

       ////*******************************
//		int length = 17;
//		boolean useLetters = true;
//		boolean useNumbers = false;
//		String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
//		System.out.println(generatedString);
		
		//// *******************************
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 15;
		Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();
		System.out.println(generatedString);
	}
}
