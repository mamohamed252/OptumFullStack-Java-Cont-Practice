package coreJavaExerciseOperatorsAndNumbers.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//caclIntegerBinary();
		//caclIntegerBinaryToDec();
		//calcIntergerToBinaryJavaFunctionLeft();
		//calcIntergerToBinaryJavaFunctionRight();
		//calThreeIntBit();
		//postfixIncrementation();
		preVsPostIncrementation();
	}

	private static void caclIntegerBinary() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Please enter integer to convert to binary: ");
		num = sc.nextInt();
		String result = "";
		while(num > 0) {
			result = ((num % 2) == 0 ? "0" : "1") + result;
			num = num / 2;
		}
		
		System.out.println(result);
	
	}
	
	
	private static void caclIntegerBinaryToDec() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter binary number: ");
		int result = 0;
		int userInput = sc.nextInt();
		
		int counter = 0;
		
		while(true) {
			if (userInput == 0) {
				break;
			} else {
				int temp = userInput % 10;
				result += temp * Math.pow(2, counter);
				userInput= userInput/10;
				counter++;
			}
		}
		System.out.println("Binary to int is + " + result);;
		
	}
	
	private static void calcIntergerToBinaryJavaFunctionLeft() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter integer to be converted into binary: ");
		
		int userInput = sc.nextInt();
		
		Integer.toBinaryString(userInput);
		int result = userInput << 1;
		// I guess it will be binary 4 for the decimal 2
		// You may check for the numbers 2, 9, 17 and 88
		System.out.println("Binary Number Shifted left 1 is: " + result);
	}
	
	private static void calcIntergerToBinaryJavaFunctionRight() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter integer to be converted into binary: ");
		
		int userInput = sc.nextInt();
		
		Integer.toBinaryString(userInput);
		int result = userInput >> 2;
		// I guess it will be binary 37 for the decimal 150
		// You may check for the numbers 150, 225, 1555 and 32456
		System.out.println("Binary Number Shifted left 1 is: " + result);
	}
	
	private static void calThreeIntBit() {
		int x = 7;
		int y = 17;
		int z = x & y;
		// z will be 0111 for 7 and 0001 for 17
		
		System.out.println("Binary Operator for Z is " + z);
	}


	private static void postfixIncrementation() {
		int x = 5;
		
		System.out.println(x++);
		System.out.println(x);
	}
	
	private static void threeMethodsIncrementation() {
		int x = 5;
		
		System.out.println(x++);
		
		x += 1;
		System.out.println(x);
		
		System.out.println(++x);
	}
	
	private static void preVsPostIncrementation() {
		int x, y, sum;
		
		x = 5;
		y = 8;
		sum = ++x + y;
		// x = 6
		System.out.printf("\nPreFix: %d\n", sum);
		// x = 6
		x = 5;
		sum = x++ + y; 
		// x = 7 
		System.out.printf("\nPostFix: %d\n", sum);
	}
}
















