package run;

public class RunMe {

	public static void main(String[] args) {
		long startingTime = System.nanoTime(); // 1,000,000,000 nano = 1 second
		//Run here the solution
		long endTime = ( System.nanoTime() - startingTime)/ 1_000_000;
		System.out.println("It's took about " + endTime + " ms, and " + endTime / 1000 + " seconds");

		
	}

}
