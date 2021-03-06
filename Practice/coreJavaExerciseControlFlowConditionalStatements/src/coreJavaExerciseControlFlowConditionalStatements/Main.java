package coreJavaExerciseControlFlowConditionalStatements;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calcIntLessThan();
		//calcIntIfLessThanElseGreater(); 
		//calcIntIfLessThanBetweenAndElse();
		//calcOutOfRange();
		switchCaseDayOfWeek();

	}
	
	public static void calcIntLessThan() {
		/*
		 * Write a program that declares 1 integer variable x, 
		 * and then assigns 7 to it. Write an if statement to 
		 * print out �Less than 10� if x is less than 10. 
		 * Change x to equal 15 and notice the result 
		 * (console should not display anything).
		 *
		 */
		
		int x = 7;
		x = 15;
		if(x < 10) {
			System.out.println("Less than 10");
		}
		
	}
	
	public static void calcIntIfLessThanElseGreater() {
		/*
		 * Write a program that declares 1 integer variable x, and 
		 * then assigns 7 to it. Write an if-else statement that 
		 * prints out �Less than 10� if x is 
		 * less than 10 and �Greater than 10� if x is greater than 10. 
		 * Change x to 15 and notice the result.
		 *
		 */
		int x = 7;
		if(x < 10) {
			System.out.println("Less than 10");
		}else {
			System.out.println("Greater than 10");
		}
		
			
		}
	
	public static void calcIntIfLessThanBetweenAndElse() {
		/*
		 *Write a program that declares 1 integer variable x, 
		 *and then assigns 15 to it. 
		 *Write an �if-else-if� statement that prints out �Less than 10� if x is less than 10,
		 *�Between 10 and 20� if x is greater than 10 but less than 20, and �Greater than or equal to 20� 
		 *if x is greater than or equal to 20. Change x to 50 and notice the result.
		 * 	
		 */
		
		int x = 15;
		if(x < 10) {
			System.out.println("Less than 10");
		}else if(x >= 10 && x < 20 ) {
			System.out.println("Between 10 and 20");
		}else {
			System.out.println("Greater than or equal to 20");
		}
	}
	
	public static void calcOutOfRange() {
		/*
		 *Write a program that declares 1 integer 
		 *variable x, and then assigns 15 to it. 
		 *Write an if-else statement that prints 
		 *�Out of range� if the number is less than 10 
		 *or greater than 20 and prints �In range� 
		 *if between 10 and 20 (including equal to 10 or 20). 
		 *Change x to 5 and notice the result.
		 *
		 */
		
		int x = 15;
		if(x >= 10 && x <= 20) {
		System.out.println( x+ " =including equal to 10 or 20 ");	
		}else if(x < 10 ) {
			System.out.println(x + " = Out of range");
		}else {
			System.out.println(x + " = In range");
		}
	}
	
	public static void calGrades() {
		/*
		 *Write a program that uses if-else-if statements to print out grades
		 * A, B, C, D, F according to the following criteria:
		A: 90-100
		
		B: 80-89
		
		C: 70-79
		
		D: 60-69
		
		F: <60
		Use the Scanner class to accept a number score from the 
		user to determine the letter grade. 
		Print out �Score out of range.� if the score is less than 0 or greater than 100.
		 *
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter score");
		int score = sc.nextInt();
		if(score < 60) {
			System.out.println("F");
		}else if(score < 70 && score > 59) {
			System.out.println("D");
		}else if(score < 80 && score > 69) {
			System.out.println("C");
		}else if(score < 90 && score > 79) {
			System.out.println("B");
		}else if(score < 100 && score > 89) {
			System.out.println("A");
		}else if(score < 0 || score > 100){
			System.out.println("Scoure out of range");
		}
		
		
	}
	
	public static void switchCaseDayOfWeek() {
		/*
		 *Write a program that accepts an integer 
		 *between 1 and 7 from the user. 
		 *Use a switch statement to print out the corresponding weekday.
		 * Print �Out of range� if the number is 
		 * less than 1 or greater than 7. 
		 * Don�t forget to include �break� statements in each of your cases.
		 *
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number 1 through 7: ");
		
		int userInput = sc.nextInt();
			switch (userInput) {
			  case 1:
			    System.out.println("Monday");
			    break;
			  case 2:
			    System.out.println("Tuesday");
			    break;
			  case 3:
			    System.out.println("Wednesday");
			    break;
			  case 4:
			    System.out.println("Thursday");
			    break;
			  case 5:
			    System.out.println("Friday");
			    break;
			  case 6:
			    System.out.println("Saturday");
			    break;
			  case 7:
			    System.out.println("Sunday");
			    break;
			  default:
				 System.out.println("Out of range: Please enter number between 1 and 7"); 
				 break;
			}	
	}
}
