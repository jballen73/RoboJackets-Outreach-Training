import java.util.Scanner;

/*
 * This file contains the solutions for the example problems that were given 11/11 and 11/18
 */
public class Example {

	public static void main(String[] args) {
		
//		triangle(8);
//		triangleReverse(8);
//		fibonacci();
//		fizzBuzz();
//		System.out.println(reverseString("My name is Jacob"));
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int myNum = input.nextInt();
//		System.out.println(myNum);
//		System.out.print("Enter a String: ");
//		input.nextLine();
//		String myString = input.nextLine();
//		System.out.println(myString);
//		System.out.println("This line");
		triangleInput();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public static void triangle(int rows) {
for (int i = 1; i <= rows; i++) {
	for (int j = 0; j < i; j++) {
		System.out.print("*");
	}
	System.out.println();
}	

}

public static void triangleReverse(int rows) {
	for (int i = 1; i <= rows; i++) {
		for(int j = 0; j < rows - i; j++) {
			System.out.print(" ");
		}
		for (int j = 0; j < i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}
public static void triangleInput() {
	System.out.print("Enter a number of rows: ");
	Scanner input = new Scanner(System.in);
	triangle(input.nextInt());
}
public static void fibonacci() {
	int num1 = 0;
	int num2 = 1;
	int sum = num1 + num2;
	while (sum < 200) {
		
		System.out.println(num2);
		sum = num1 + num2;
		num1 = num2;
		num2 = sum;
		
	}

}

public static void fizzBuzz() {
	for (int i = 1; i <= 100; i++) {
		if (i % 15 == 0) {
			System.out.println("fizzbuzz");
		} else if (i % 3 == 0) {
			System.out.println("fizz");
		} else if (i % 5== 0) {
			System.out.println("buzz");
		} else {
			System.out.println(i);
		}
	}

}

public static int fibb(int n) {
	if (n <= 1) {
		return 1;
	} else {
		return fibb(n-2) + fibb(n-1);
	}
}
public static void fibb2() {
	for (int i = 0; i < 20; i++) {
		System.out.println(fibb(i));
	}
}
public static String reverseString(String s) {
	if (s.length() == 1) {
		return s;
	}else {
		return reverseString(s.substring(1)) + s.charAt(0);
	}
}
}