package learning;
import java.util.Scanner;
public class UserInput {
public static void main(String[] args) {
	Scanner user_input = new Scanner(System.in);
	String first_name;
		System.out.print("What is your first name?:");
		first_name = user_input.next();
	
	String last_name;
	 System.out.print("What is your last name?:");
	 last_name = user_input.next();
	 
	 String full_name;
	 full_name = first_name + " " + last_name;
	 
System.out.println("You are called" + " " + full_name);

	}
}