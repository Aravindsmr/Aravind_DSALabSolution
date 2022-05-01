package com.greatlearning.questionone;

public class BBDriver {

	// Driver code
	public static void main(String[] args) {

		BalancedBrackets balBrackets = new BalancedBrackets();

		String inpOne = "([[{}]])";
		String inpTwo = "([[{}]]))";

		// First input check
		System.out.println("Check Balanced for : " + inpOne);

		if (balBrackets.checkBalanced(inpOne))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");

		// Second input check
		System.out.println("Check Balanced for : " + inpTwo);

		if (balBrackets.checkBalanced(inpTwo))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}

}
