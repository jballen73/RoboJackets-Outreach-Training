import java.util.Scanner;
public class Test{
	
	public static void main(String[] args) {
		int[] myArray = {1,3,7,9,16,23,40,91};
		System.out.println(gcd(1440, 408));
		
	}
	public static int sumArray(int[] array) {
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		return sum;
	}
	public static int sumArrayRecursive(int[] array) {return sumArrayRecursive(array,0);}
	public static int sumArrayRecursive(int[] array, int index) {
		if (index == array.length - 1) {
			return array[index];
		} else {
			return array[index] + sumArrayRecursive(array, index + 1);
		}
	}
	public static int binarySearch(int[] array, int target) {
		return binarySearch(array, target, 0, array.length - 1);
	}
	public static int binarySearch(int[] array, int target, int low, int high) {
		if (high < low) {
			return -1;
		}
		int mid = ((low + high) / 2);
		if (array[mid] == target) {
			return mid;
		} else if (array[mid] > target) {
			return binarySearch(array, target, low, mid - 1);
		} else {
			return binarySearch(array, target, mid + 1, high);
		}
	}
	public static int gcd(int a, int b) {
		if (b == 0 || a == 0) {
			return 0;
		}
		if (b > a) {
			return gcdFinder(b, a);
		}
		return gcdFinder (a, b);
	}
	private static int gcdFinder(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcdFinder(b, a%b);
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
