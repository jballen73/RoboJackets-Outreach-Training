import java.util.Scanner;
public class Test{
	
	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);
		for(int i = 1; i <= 5; i++) {
			System.out.print("How many rows do you want? ");
			int numRows = input.nextInt();
			triangleReverse(numRows);
		}
		input.close();
	}
	
	
	
	public static void triangle(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("$ ");
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
				System.out.print("**");
			}
			System.out.println();
		}
		
	}
}
