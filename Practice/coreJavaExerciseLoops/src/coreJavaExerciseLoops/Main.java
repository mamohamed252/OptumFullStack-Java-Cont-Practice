package coreJavaExerciseLoops;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//loopToTen();
		//whileloopIncrements();
		//doWhileLoop();
		//forLoopIncrementContinue();
		//forLoopIncrementBreak();
		//nestedLoopWeek();
		//forLoopIncrementBreak();
		//palindromesChecker();
		//fibLengthChecker();
		nestForLoopAgain();

	}

	private static void loopToTen(){
		/*
		 * Write a program that uses a for-loop to
		 * loop through the numbers 1-10 and prints 
		 * out each number.
		 */

		System.out.println("Numbers 1 - 10");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	private static void whileloopIncrements(){

		/*
		 * Write a program that uses a while loop to loop 
		 * through the numbers 0-100 in increments of 
		 * 10 and prints out each number.
		 */
		System.out.println("Numbers 0 - 100");
		int num = 0;
		while (num <= 100) {
			System.out.println(num);
			num = num + 10;
		}
	}

	private static void doWhileLoop(){

		/*
		 * Write a program that uses a do-while-loop to 
		 * loop through the numbers 1-10 and 
		 * prints out each number.
		 */
		System.out.println("Numbers 1 - 10");
		int num = 1;

		do {
			System.out.println(num);
			num++;
		} while (num <= 10);
	}

	private static void forLoopIncrementContinue(){

		/*
		 *Write a program that uses a for-loop to loop 
		 *through the numbers 1-100. Print out each number 
		 *if is a multiple of 5, but do not print out any 
		 *numbers between 25 and 75. Use the �continue� 
		 *statement to accomplish this.
		 */
		System.out.println("Numbers 1 - 100");

		for (int i = 1; i <= 100; i++) {
			if(i >= 25 && i <= 75) {
				continue;	
			}if(i % 5 == 0) {
				System.out.println(i);
			}

		}

	}

	private static void forLoopIncrementBreak(){

		/*
		 *Write a program that uses nested for-loops to output the following:
			Week 1:

			Day 1

			Day 2

			Day 3

			Day 4

			Day 5

			Week 2:

			Day 1

			Day 2

			Day 3

			Day 4

			Day 5
		 */

		for (int i = 1; i <= 2; i++) {
			System.out.println("Week " + i + ":");
			for (int j = 1; j <= 5; j++) {
				System.out.println("Day " + j);
			}

		}

	}


	private static void nestedLoopWeek(){

		/*
		 *Write a program that uses a for-loop to loop through 
		 *the numbers 1-100. Print out each number if is a multiple of 5, 
		 *but do not print out any numbers greater than 50. Use the �break� 
		 *keyword to accomplish this.
		 */
		System.out.println("Numbers 1 - 100");

		for (int i = 1; i <= 100; i++) {
			if(i > 50) {
				break;	
			}if(i % 5 == 0) {
				System.out.println(i);
			}

		}

	}

	private static void palindromesChecker(){

		/*
		 *Write a program that returns all the available 
		 *palindromes within 10 and 200. The following 
		 *output will be produced:
		 */
		System.out.println("Numbers 10 - 200");

		for (int num = 10; num <= 200 ; num++) {
			String numChecker = String.valueOf(num);
			if(check(numChecker)) {
				System.out.println(num + " is a palindrome");
			}	
		}

	}

	public static boolean check(String xWord) {

		boolean check;
		String reversedWord = "";
		for (int i = xWord.length() - 1; i >= 0; i--) {
			reversedWord += xWord.charAt(i);
		}
		if (xWord.equals(reversedWord)) {
			check = true;
		} else {
			check = false;

		}
		return check;
	}

	public static void fibLengthChecker() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(fibMath(i));
		}
	}
	public static int fibMath(int userInput) {
		/*
		 * Write a program that prints the Fibonacci 
		 * Sequence from 0 to 50. The following output will be 
		 * produced: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
		 */


		int startingPoint = 0;
		int nextPosition = 1;
		int sumOfSN = startingPoint + nextPosition;

		if (userInput == 1) {
			return 0;
		} else if (userInput == 2) {
			return 1;
		}

		//	        while (userInput > 1) {
		//	            sumOfSN = startingPoint + nextPosition;
		//	            counter = sumOfSN;
		//	            userInput;
		//	        }
		for (int i = 0; i < userInput-2; i++) {
			if (userInput > 2) {
				sumOfSN = startingPoint + nextPosition;
				startingPoint = nextPosition;
				nextPosition = sumOfSN;
			}

		}
		return sumOfSN;
	}
	public static void nestForLoopAgain() {
		/*
		 * Write a program that nests a for-loop 
		 * inside another. Print out the inner and outer 
		 * variable (e.g., i or j) in the inner loop 
		 * (e.g., System.out.println("Inner loop: i: " + i + ", j: " + j);).
		 */

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Inner loop: i: " + i + ", j: " + j);
			}
		}
	}
}
