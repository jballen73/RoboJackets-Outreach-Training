import java.util.Scanner;

public class EverythingReference {

	public static void main(String[] args) {
		//One of the first things we learned about programming is that you can use variables to store values.
		//These variables have specific types, but their values can be changed as much as you want.
		//The most common types we'll use are:
		String myString = "Hello"; //Strings, which essentially store words
		myString = "Pizza";//Note that we use double quotes to define the words that we put into strings
		myString = "RoboJackets";
		myString = "WildCat5e";//Numbers and special characters can also go in strings
		myString = "\"Hello\"";//You have to use a \ to put in certain specific characters though
		int myInt = 5;//Ints store integer values, or numbers.  Note that these do not have a decimal place
		myInt = 7;
		myInt = 9075;
		double myDouble = 6.3;//Doubles store decimal values
		myDouble = 6.0;
		myDouble = 9.98235;
		boolean myBoolean = true;//Boolean values can only hold either true or false
		myBoolean = false;
		char myChar = 'a';//chars can hold individual character values
		myChar = '5';//These range from letters to numbers to special characters
		
		int myNewInt;//If we want, we can declare a variable without assigning it a value
		myNewInt = 6;//However, if we want to use this variable for anything, we'll need to
		//assign it a value at some point
		
		//We learned that we can print out things to the console using the System.out.println() method
		System.out.println("Hello World!");//Notice we pass in a string as our argument
		String helloWorld = "Hello World!";//This means if we use a variable...
		System.out.println(helloWorld);//We can print it by just calling the variable
		System.out.println(5 + " is an int and " + 5.0 + " is a double");//Java will implicitly 
		//convert things to strings, and we use the '+' operator to concatenate strings together
		System.out.print("One");//If we just use System.out.print(), we won't have a line break at the end
		System.out.print("Two");
		System.out.println("Three");
		//We can also use printf in order to print out strings and nonstrings together without concatenating them
		System.out.printf("%d is another int and %.2f is another double%n",  82, 62.5);//The .2 will cause the decimal to be rounded to 2 places
		
		//Math in java works generally how we expect it to, and we have a couple of different operators to use.
		// Addition +
		// Subtraction -
		// Multiplication *
		// Division /
		// Modulo % (gives the remainder of division)
		
		//An important thing to note about division is that division between ints will always return an int.
		//This means that if there would be a decimal component, it is completely disregarded.
		//Therefore 2/3 will equal 0 becuase it the only non-decimal part is the 0
		//You can fix this by converting either 2 or 3 to a double before division, so 2.0/3 will work, 
		//2/3.0 will work, and 2.0/3.0 will work.
		
		//Java also has short hand notation for arithmetic involving the variable you are reassigning to.
		//For example:
		double myCoolNumber = 6.0;
		myCoolNumber += 2.0; //This is the same as myCoolNumber = myCoolNumber + 2.0
		myCoolNumber -= 4.0; //This is the same as myCoolNumber = myCoolNumber - 4.0
		myCoolNumber /= 2.0; //This is the same as myCoolNumber = myCoolNumber / 2.0
		myCoolNumber *= 3.0; //This is the same as myCoolNumber = myCoolNumber * 3.0
		myCoolNumber++; //This is the same as myCoolNumber = myCoolNumber + 1
		myCoolNumber--; //This is the same as myCoolNumber = myCoolNumber - 1
		
		/////////////////
		//Control Logic//
		/////////////////
		
		//If-else statements are our main form of logical control structures we can use in java
		//The general syntax of these statements are if(condition){code}else{more code}
		//The condition needs to be either a boolean or something that evaluates to one
		if(true) {//Since this is true....
			System.out.println("True!");//This line of code will run...
		} else {
			System.out.println("False!");//And this line will not run.
		}//Notice we use curly braces {} to define blocks of code for if-else statements
		
		//We can use relational operators in order to compare two primitive data types together.
		//The relational operators are:
		// Less than <
		// Less than or equal to <=
		// Greater than >
		// Greater than or equal to >=
		// Exactly equal to ==     Note that this is two equals signs, this is very important!
		// Not equal to !=
		int comparingInt = 5;
		if (comparingInt < 7) {
			System.out.println("Less than 7");
		} else {
			System.out.println("Not less than 7");
		}
		//Sometimes we want more than two possibilities for our if-else statement.
		//This is where we get the if-else if statement
		//This has the form if(condition){code}else if(condition){code}...}else{code}
		//Every condition will be evaluated in order until one of them is true, and that block will run
		int comparingInt2 = 28;
		if (comparingInt2 < 28) {
			System.out.println("Less than 28");
		} else if (comparingInt2 > 28) {
			System.out.println("Greater than 28");
		} else if (comparingInt2 == 28) {
			System.out.println("Exactly 28");
		} else {
			System.out.println("Something went wrong!");
		}

		//If we care about more than one condition, then we can use logical operators to help us
		//There are three logical operators we really care about here:
		// AND &&
		// OR ||
		// NOT !
		//So for example if we want to check if a number is between 40 and 60...
		int number = 72;
		if (number >= 40 && number <= 60) {//Both of these expressions need to evaluate to true for the overall condition to be true
			System.out.println("Illogical...");
		} else {
			System.out.println("Logical!");
		}
		//Or if instead we want to explicitly check if a number is NOT in that range,
		//there are a few ways we can do it.  The following two methods are equivalent.
		if (number < 40 || number > 60) {}
		if (!(number >= 40 && number <= 60)) {}
		
		/////////
		//Loops//
		/////////
		
		//Loops are used whenever we want a piece of our code to run multiple times without copy pasting it
		//There are two primary kinds of loops, and while both can be used interchangeably, they each
		//have their specialty.
		
		//For loops are used when you want to loop a specific number of times.
		//This number is either known by you when writing your code, or should be known by your code (through a variable)
		//at the time that you reach it.
		//The syntax for a for loop is for(initializing varible; looping condition; what happens at the end){code}
		//In practice, this usually looks like the following:
		for (int i = 0; i < 5; i++) {//i is generally the variable used as a for loop controller
			System.out.println("Hi");//This should print 5 times
		}
		//In this case, our loop-controlling variable is initialized with a value of 0, 
		//the loop continues until it's value is no longer less than 5 (so it is greater than or equal to 5)
		//and at the end of each loop i is increased by 1.
		
		//With this syntax, the loop will iterate as many times as whatever number you have in place of 5
		//This can be some predetermined value you know of, or a variable in your code.
		//But it's important to remember that i is a variable too, and we can use it within the loop
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();//This is just used to make a line break
		
		//Notice that we have to redeclare i in this second loop.  This is because the scope of i is limited
		//to the loop it is defined in.  If we tried to use it outside of the loop, we would get a compilation error.
		
		//Something else for loops can do is count down as well as count up.  For example,
		//if we wanted to do a countdown from 5:
		
		for (int i = 5; i > 0; i--) {//Note that it's -- this time instead of ++
			System.out.println(i);
		}
		System.out.println("BLAST OFF");
		
		//Be VERY careful when making loops, if you make a mistake you may find yourself with an infinite loop
		//which can be very annoying to debug.  Always make sure your looping condition is something 
		//that will eventually return false.
		
		//While Loops
		
		//As a counterpart to for loops, while loops are generally used when you aren't exactly sure
		//how many times your loop will have to run, but you know a condition that will require your loop to stop.
		//The syntax of a while loop is while(condition){code}
		//It is important to note that this condition is checked at the beginning of each loop,
		//so if it is not true in the first place your loop will never run (this is the same with for loops)
		
		//For example, this loop will print out all square numbers less than 1000.
		int squares = 1;
		while (squares * squares < 1000) {//While the square is less than 1000...
			System.out.println(squares * squares);//Print out the square...
			squares++;//And then increment the number we're squaring.  This will eventually cause our loop to exit
		}
		
		//Just like with for loops, make sure your loop is designed so that it will eventually stop running
		
		//////////
		//Arrays//
		//////////
		
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
		
		
		////////////
		//Scanners//
		////////////
		//Because a Scanner is an object, we need to create it before we can use it
				//Initializing the Scanner that we will use to read the inputs:
				Scanner input = new Scanner(System.in);//Because Scanner is not in java.lang, we need to import it
				//Asking for input from the user
				System.out.print("Enter a number: ");
				//Taking the next number that is entered and storing it in a variable
				//NOTE: If you enter something that is not a number, this will throw an exception
				int myNum = input.nextInt();
				//Prints whatever the person entered
				System.out.println("You entered: " + myNum);
				//Asks the user for more input, a word this time
				System.out.println("Now enter a word: ");
				//This is supposed to put the word in another String variable, but...
				String myWord = input.nextLine();
				//It doesn't!  The next line immediately runs and nothing is stored in the variable.
				//What happened is that when you entered the number earlier, you didn't just enter a number.
				//You entered a number and a newline character, but the nextInt() method only stored the number, 
				//Leaving the newline character there.  When you ran nextLine(), it picked up that newline character
				//And stored it in myWord before the user had any chance to enter anything.
				System.out.println("Whoops!  Too slow!  The only thing I got was : " + myWord);
				//However, since that newline character is now gone, these next lines of code will work as we expect
				System.out.print("Ok, try again.  Give me another word: ");
				//This line will correctly get whatever the user types in...
				myWord = input.nextLine();
				//And this line will print it out just as we wanted it to.
				System.out.println("You typed " + myWord + " this time, right?");	
		
	}
	
	///////////
	//Methods//
	///////////
	//We can use methods whenever we want to reuse code without copy-pasting it
	//The methods consist of 2 main things:
	//The method header, where the method is declared an information about it is given
	//The method body, where we write code that will run whenever our method is called
	
	//Method headers have 5 distinct parts that we need to consider whenever making a method
	//Visibility modifier-this determines where the method can be called from.
	//There are 4 visibility modifiers:
	//private - can only be called within the same class
	//[no modifier] - private + can be called from the same package
	//protected - [no modifier] + can be called by subclasses
	//public - can be called from anywhere
	
	//The two primary modifiers we will every use are public and private
	//Don't worry too much about this now if you don't understand it
	
	//Static/non-static if a method is declared as static, then it can be called
	//without an instance of the class.  Non-static methods can not be called from
	//within a static method (without an associated object)
	//To declare a method as static, put 'static' in the method header
	
	//Return type - this is what type of variable the method will return.
	//This can be any of the variable types we have talked about already, 
	//any object that we make, or void if the method will not return anything
	//If the method has a return type, there needs to be a return statement in the method
	
	//Method name - this is how we will call the method in our code.
	//Method names should be descriptive, and follow the same naming conventions
	//that variables do (first letter lowercase, then camel case)
	//Be wary of declaring two methods with the same name.  It can work under 
	//specific conditions but make sure you know what you're doing
	
	//Paramter list - this is the list of arguments anyone will have to pass in when
	//calling our method.  For example, a method that adds two numbers will want
	//to take in two ints as arguments.  The names we give our parameters are arbitrary
	//and will only be used within our method body.
	
	//For example, the main method has the header:
	//public static void main(String[] args)
	//This means it is a method that is visible anywhere,
	//not tied to an instance of the class,
	//doesn't return anything,
	//has the name main,
	//and takes an argument called args of type String[]
	
	//And this method:
	//public static int add(int num1, int num2)
	//Is visible anywhere,
	//is not tied to an instance of the class,
	//returns an int,
	//has the name add,
	//and takes in two int arguments which will be called num1 and num2 in the method body
	//Note that we separate multiple parameters using a comma
	
	
	//The method body is where we put all of our code for the method.
	//For example, all of our code above is in the method body for the main method.
	//For the add method mentioned above, the method body would look like:
	/*
	 * public static void add(int num1, int num2) {
	 * 		return num1 + num2;
	 * }
	 */
	//The return statement will cause the method to evaluate to num1 + num2.
	//So in our code:
	//int mySum = add(5, 7);
	//Will assign the value of 12 to mySum
	//Notice that when we call methods, we always have parentheses afterwards
	//where we put our arguments.
	
}
