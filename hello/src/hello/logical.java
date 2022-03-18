package hello;

import java.util.Scanner;

public class logical {

	public static void main(String[] args) {
		 //logical and comparison
		  
		  System.out.println("How old are you?");
		  Scanner scanner = new Scanner(System.in);
		  int age = Integer.parseInt(scanner.nextLine());
		  System.out.println("Cats or dogs");
		  String animal = scanner.nextLine();
		  if(age > 12 && !animal.equals("dogs")) {
			  System.out.println("Welcome");
		  }

	}

}


  
/* comparison operator 
 * == equality (equal to)
 * != innequality (not equal to)
 * < less tha
 * > greater than
 * <= less than or equal to
 * >= greater than or equal to
 * logical operator
 *  && and both have to be true
 *  || or either can be true ..or both
 *   ! not (inverse the boolean
 */


		  

