import java.util.Arrays;//Note the import
public class PrintingArrays {

	public static void main(String[] args) {
		String[] RJMentors = {"Jacob","Josh","Maxim"};
		System.out.println("Useless representation: " + RJMentors);
		System.out.println("Now with a for loop:");
		for (int i = 0; i < RJMentors.length; i++) {
			System.out.println(RJMentors[i]);
		}
		System.out.println("A for-each loop is the same thing:");
		for (String s : RJMentors) {
			System.out.println(s);
		}
		System.out.println("Using the method kindly provided to us: " + Arrays.toString(RJMentors));
	}

}
