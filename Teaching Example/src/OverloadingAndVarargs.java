
public class OverloadingAndVarargs {

	public static void main(String[] args) {
		System.out.println(average(5,6));//This one uses the first method
		System.out.println(average(5,6,7));//This one uses the second method
		System.out.println(average(5,6,7,8));//This one uses the varargs method
		
	}

	//Notice that the following three methods all have the same name.  Java determines which one 
	//to use based on the arguments you pass in when you call the method.  In this case, Java will
	//look for an exact match before going to varargs.
	
	static double average(int num1, int num2) {
		return (num1 + num2)/2.0;
	}
	static double average(int num1, int num2, int num3) {
		return (num1 + num2 + num3)/3.0;
	}
	
	//This one can accept any number of int parameters
	static double average(int ... nums) {
		double sum = 0;
		for (int n : nums) {
			sum += n;
		}
		return sum/nums.length;
	}
}
