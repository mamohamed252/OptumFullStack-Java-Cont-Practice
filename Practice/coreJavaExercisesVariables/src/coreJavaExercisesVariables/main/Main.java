package coreJavaExercisesVariables.main;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Uncomment each method in Main method to see problem run. 
		
		//addTwoNum();
		
		//addTwoDoubleNum();
		
		//addIntAndDoubleNum();
		
		//addTwoIntDivideMax();
		
		//addTwoDoubleDivideMinAndCast();
		
		//addTwoIntDivideMaxAndCast();
		//System.out.println(calcConstant());
		beverageMaker();
	}
	
	private static void addTwoNum() {
		// TODO Auto-generated method stub
		
		/*
		 * Write a program that declares 2 integer variables, 
		 * assigns an integer to each, and adds them together. 
		 * Assign the sum to a variable. Print out the result.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first integer to add");
		int a = sc.nextInt();
		System.out.println("Please enter second integer to add");
		int b = sc.nextInt();
		int sum;
		sum = a + b;
		System.out.println("Your total is: " + sum);
	
	}
	
	private static void addTwoDoubleNum() {
		// TODO Auto-generated method stub
		/*
		 *Write a program that declares 2 double variables, 
		 *assigns a number to each, and adds them together. 
		 *Assign the sum to a variable. Print out the result. 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first double integer to add: ");
		double a = sc.nextDouble();
		System.out.println("Please enter second double integer to add: ");
		double b = sc.nextDouble();
		Double sum;
		sum = a + b;
		System.out.println("Your total is: " + sum);
	}
	
	private static void addIntAndDoubleNum() {
		// TODO Auto-generated method stub
		/*
		 * Write a program that declares an integer variable and a double variable, 
		 * assigns numbers to each, and adds them together. Assign the sum to a variable.
		 * Print out the result. What variable type must the sum be?
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first  integer to add: ");
		int a = sc.nextInt();
		System.out.println("Please enter second double integer to add: ");
		double b = sc.nextDouble();
		Double sum = ((double)a + b);
		System.out.println("Your total is: " + sum);
	}
	
	private static void addTwoIntDivideMax() {
		// TODO Auto-generated method stub
		/*
		 * Write a program that declares 2 integer variables, 
		 * assigns an integer to each, and divides the larger 
		 * number by the smaller number. Assign the result to 
		 * a variable. Print out the result. Now change the 
		 * larger number to a decimal. What happens? 
		 * What corrections are needed?
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first  integer: ");
		int a = sc.nextInt();
		System.out.println("Please enter second integer: ");
		int b = sc.nextInt();
		int max;
		if (a < b) {
		 max = b/a;
		}else{
		 max = a/b;	
		}
		System.out.println("Your total is: " + max);
		// correction that need to be made is max variable needs to be double, change scanner into nextDouble and parameter should be changed into double.
	}
	
	private static void addTwoDoubleDivideMinAndCast() {
		// TODO Auto-generated method stub
		/*
		 *Write a program that declares 2 double variables, 
		 *assigns a number to each, and divides the larger by 
		 *the smaller. Assign the result to a variable. 
		 *Print out the result. Now, cast the result to 
		 *an integer. Print out the result again.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first  double: ");
		double a = sc.nextDouble();
		System.out.println("Please enter second double: ");
		double b = sc.nextDouble();
		double min;
		if (a < b) {
		 min = b/a;
		}else{
		 min = a/b;	
		}
		System.out.println("Your total is: " + min);
		min = Math.round(min * 100);
		min = min/100;
		int newMin = (int)min;
		System.out.println(min);
	}
	
	private static void addTwoIntDivideMaxAndCast() {
		// TODO Auto-generated method stub
		/*
		 Write a program that declares 2 integer variables, 
		 x, and y, and assign 5 to x and 6 to y. 
		 Declare a variable q and assign y/x to it and 
		 print q. Now, cast y to a double and assign to q. 
		 Print q again.
		 */
		int x = 5;
		int y = 6;
		double q = (y/x);
		System.out.println("Your sum is: " + q);
		q = (double)y;
		System.out.println("New sum is: " + q);
	}
	
	private static int calcConstant() {
		// TODO Auto-generated method stub
		/*
		Write a program that declares a named 
		constant and uses it in a calculation. 
		Print the result.
		 */
		final int a = 2;
		final int b = 6;
		int sum = a + b;
		return sum;
	}
	
	
	private static void beverageMaker() {
		// TODO Auto-generated method stub
		/*
		Write a program where you create 3 variables that 
		represent products at a cafe. The products could be 
		beverages like coffee, cappuccino, espresso, green tea, 
		etc. Assign prices to each product. Create 2 more variables 
		called subtotal and totalSale and complete an �order� for 3 
		items of the first product, 4 items of the second product, 
		and 2 items of the third product. Add them all together to 
		calculate the subtotal. Create a constant called SALES_TAX 
		and add sales tax to the subtotal to obtain the totalSale 
		amount. Be sure to format the results to 2 decimal places.
		 */
		DecimalFormat f = new DecimalFormat("##.00");
		final double SALES_TAX = 0.07;
		double coffee = 1.50;
		double tea = 2.00;
		double soda = 1.75;
		
		double subtotal = 0;
		double totalSale = 0;
		
		subtotal = (coffee * 3) + (tea *4) + (soda *2);
		totalSale = (SALES_TAX * subtotal) + subtotal;
		System.out.println("Your subtoal for beverages is: $" + f.format(subtotal));
		System.out.println("Your order total for beverages is: $" + f.format(totalSale));
	}
	
}

