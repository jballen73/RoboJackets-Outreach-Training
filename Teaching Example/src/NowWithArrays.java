
public class NowWithArrays {

	public static void main(String[] args) {
		//We can use arrays in order to have a variable hold more than one value
		//There are three different ways we can declare an array:
		int[] array1 = new int[5];//type[] name = new type[size] declares the array with a specific size
		//Note that once we declare the size of the array, it is FIXED and we cannot change it
		int[] array2 = {1,3,5,7,9};//type[] name = {element1, element2, ...} declares the array with values
		//Again, the size is fixed at what we set it to here
		int[] array3; //Declare the name of the array with no size or elements
		//We will have to assign it to a specific size or give it values before we can use it
		
		//Accessing elements of the array
		String[] myArray = {"Noah", "Nathan", "Steven", "Jason", "Daniel", "Jacob", "Josh"};
		//To access an element of the array, we call the name of the array and put the element index in []
		//Arrays in Java are zero indexed, so the first value of the array is the 0th element
		//So..
		System.out.println(myArray[0]);//Will print "Noah" to the console
		//This also means that the last element in our array is the "length - 1" element
		//So because our array has 7 elements, myArray[6] is the last element, and myArray[7] will give an error
		//If we want to know the length of our array, we can use .length
		System.out.println(myArray.length);//This will print 7, the number of elements in our array
		//Notice that there are no parentheses here, this is different from Strings
		
		//Iterating through the array
		//Because we want to iterate through every element of our loop, we know in our code exactly how many times
		//we want to loop.  Therefore, a for loop is useful:
		for (int i = 0; i < myArray.length; i++) {//This is the general syntax of a for loop for arrays
			System.out.println(myArray[i]);//This will print each element of the array on a new line
		}
		
		//Java also has another syntax of for loops that is particularly useful for applications like this.
		//This is called a for-each loop:
		for (String s : myArray) {
			System.out.println(s);
		}
		//This will loop over every element in myArray, and assign each element to the variable s.
		//Then it prints out that element.
		//Notice that nowhere in the loop do we use the index of the element in the array.
		//If the index is important in any way, then we cannot use a for-each loop.
	}

}
