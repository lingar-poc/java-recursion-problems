package run;

import problems.PrintAllCombinations;

public class RunMe {

	public static void main(String[] args) {
		long startingTime = System.nanoTime(); // 1,000,000,000 nano = 1 second
		//reseting the efficiency counter
		PrintAllCombinations.counter1 = 0;
		//Run here the solution
		String sequence = "1234";
		System.out.println("Finding all possible combination from the string: " + sequence);
		PrintAllCombinations.try1FindAllPossible(new StringBuilder(), new StringBuilder(sequence));
		System.out.println("Efficiency counter = " + PrintAllCombinations.counter1);
		long endTime = ( System.nanoTime() - startingTime)/ 1_000_000;
		System.out.println("It's took about " + endTime + " ms,  " + endTime / 1000 + " seconds");

		
	}

}
