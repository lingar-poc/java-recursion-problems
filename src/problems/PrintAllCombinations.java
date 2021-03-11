package problems;

public class PrintAllCombinations {
	//efficiency counter 
	public static int counter1 = 0;
	
	/**
	 * For the used actions we can use easily delete/append functionality which
	 * provided by StringBuilder
	 * 
	 * Each loop the function "Running 1 forward" which mean ("","1234") =
	 * ("1","234") ... ("12","34") = ("123", "4")
	 * 
	 * @param part1 - the fixed part of the combination
	 * @param part2 - the part that should make the switching
	 */
	public static void try1FindAllPossible(StringBuilder part1, StringBuilder part2) {
		counter1++;
//		// Uncomment this if you want to run it slowly
//		try {
//			System.out.println("loop");
//			Thread.sleep(1000);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}

		// Base case
		if (part2.length() == 1) {
			System.out.println("" + part1 + part2);
			return;
		}
		StringBuilder newPart1 = new StringBuilder(part1);
		;
		StringBuilder newPart2 = new StringBuilder(part2);
		// Running one forward
		if (part2.length() > 0) {
			newPart1.append(part2.charAt(0));
			newPart2.deleteCharAt(0);
		}

		try1FindAllPossible(newPart1, newPart2);
		for (int i = 1; i < part2.length(); i++) {

			// Taking i and insert it at the beggining of part2

			// Reseting new parts
			newPart1 = new StringBuilder(part1);
			newPart2 = new StringBuilder(part2);

			// Running the same but one forward
			newPart2.deleteCharAt(i);
			newPart2.insert(0, part2.charAt(i));

			// move one forward and send
			newPart1.append(newPart2.charAt(0));
			newPart2.deleteCharAt(0);
			try1FindAllPossible(newPart1, newPart2);
		}

	}
}
