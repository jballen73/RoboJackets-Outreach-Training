package Classes.Students;//Ignore this line for now, it's a quirk of having to move the file
//Eclipse will put this automatically if it's something you need


public class GTStudent {
	//This is our first example of a class that we are writing ourself.
	//Classes are essentially templates to make objects of that type.
	//So, for example, this class can be used to make objects of type 'GTStudent.'
	//Our most prominent example of an object that we've seen so far are Scanners
	//If you remember, we had to declare the Scanner in a specific way, and pass it an argument
	//These arguments are used to define variables that are specific to each instance of the object
	//This means that we can define a variable in the class, and every time we make a new GTStudent it will have a different value
	//You also may remember that the Scanner had a couple of methods that we could call on it.
	//These methods were also specific to the instance of the Scanner (we did input.next(), not Scanner.next())
	
	//Our first step in making our own class is to define all of the variables we want it to have.
	//These are called instance variables.
	private String name;//Notice that when we declare these variables, we do not give them a value.
	private int age;//We also make the variables private, which involves a programming concept called encapsulation that we will explain later.
	
	//After we have declared our instance variables, we then want to make our constructors.
	//This describes how users will have to create our class.
	//If you remember from Scanners, we could make a Scanner by either passing in System.in or a File
	//Generally, you want to make constructors that define all of your instance variables
	//Constructors have the format 'public className(parameters){}'
	public GTStudent(String n, int a) {//These arguments are exactly what a user will have to pass in to make a GTStudent
		name = n;//Since our name and age variables are in a wider scope, we can reference them in the constructor
		age = a;
	}
	
	//Now that we have a constructor, we want some methods that people can use with our class.
	//Since we made our name and age variables private, we want to make some way for users to see them
	//These methods have a very simple structure, and are called 'getter' or 'accessor' methods
	public String getName() {//Notice that these methods are not static anymore.  This is because they ARE specific to a specific instance of GTStudent
		return name;
	}
	public int getAge() {
		return age;
	}
	
	//Now that we have some getters, we want some other methods that are useful for our class
	//A very common method that you will define for any class you write is called the toString method
	//Whenever you put any non-string argument in a System.out.print statement, it will automatically call the toString method
	//The default toString method is very useless for our purposes, so we want to 'override' the method
	//When we override a method, our method header needs to be exactly the same as the method we're overriding
	//While not necessary, using the @Override tag will make sure that we override successfully
	@Override
	public String toString() {
		return "Hi, my name is " + name + " and I am " + age + " years old.";//Notice that we return the string, not print it
	}
	
	//Another useful method to write would be a way to check if two GTStudents are equal or not
	//You may think to use the == operator, but this only works properly for primitives.
	//Instead we can override another method, the equals method.
	//This method has a very formulaic way to write it, and some of it may seem weird, so I'll try to annotate it the best I can
	@Override
	public boolean equals(Object o) {//Remember this needs to be Object for it to override properly
		if (o == null) {return false;}//If o is null, then return false
		if (o == this) {return true;}//If o and this object are the exact same (think me.equals(me)) return true
		if (!(o instanceof GTStudent)) {return false;}//If o is NOT a GTStudent, return false
		GTStudent other = (GTStudent)o;//Cast the argument to a GTStudent now that we know it's safe
		return other.getName().equals(name) && other.getAge() == age;//Now we return true if the important variables are the same
		//Notice that we used a .equals for the String (name) and a == for the int (age)
	}
}
