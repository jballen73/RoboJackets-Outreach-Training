import java.util.Scanner;//Note the import
public class BasicUserInput {

	public static void main(String[] args) {
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

}
