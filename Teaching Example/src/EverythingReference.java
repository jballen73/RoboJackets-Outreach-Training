
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
	}

}
