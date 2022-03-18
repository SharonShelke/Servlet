package hello;

import java.util.Scanner;

public class controlstats {

	public static void main(String[] args) {
	  String password ="let me in";
	  System.out.println("Guess the password:");
 
	  Scanner scanner = new Scanner(System.in);
	  String guess = scanner.nextLine();
	  System.out.println(password.equals(guess));
	   
	  if(password.toLowerCase().equals(guess)) {
		  System.out.println("your guess was correct !");
		 // return;
		} else if("dont stop".equals(guess))
		{
			 System.out.println("You got the second password");

		}else {
			System.out.println("This is false");
		}
	   
	 scanner.close();
	}

}
