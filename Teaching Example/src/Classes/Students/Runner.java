package Classes.Students;//Again, ignore this for now

public class Runner {

	public static void main(String[] args) {
		//You may have noticed that in our GTStudent class we did not have a main method
		//That's because we never planned to run that class, just make a template for GTStudents
		//Here we have a main method because we plan to test out the class we made
		//Just like with Scanners, we have to declare objects in a specific way
		GTStudent jacob = new GTStudent("Jacob", 18);//When we instantiate the class, we have to provide the correct arguments
		System.out.println(jacob);//This implicitly uses the toString() method we wrote to know what to print
		GTStudent josh = new GTStudent("Josh", 20);//We can create as many GTStudents as we want, each with different values for their instance variables
		System.out.println(josh);
		System.out.println("josh.equals(jacob) : " + josh.equals(jacob));//This will obviously print false
		System.out.println("jacob == new GTStudent(\"Jacob\", 18) : " + (jacob == new GTStudent("Jacob", 18)));
		//If we want to , we can declare an anonymous instance of our class like in the above statement
		//You may have expected the above to be true, but it isn't.  Using the == will check if the two
		//arguments have the same location in memory.  Because we declared them separately, that is not the case.
		//However, this is precisely why we created the .equals method.  So:
		System.out.println("jacob.equals(new GTStudent(\"Jacob\", 18) : " + (jacob.equals(new GTStudent("Jacob", 18))));//Prints true
	}

}
