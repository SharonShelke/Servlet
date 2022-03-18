package hello;

import java.util.Scanner;

public class loopss {

	public static void main(String[] args) {
		/*icu
		 * 
		 * initialization
		 * comparison/condition
		 * update
		 */
		System.out.println("Guess the passwoord:");
		String password ="let me in";
		Scanner scanner = new Scanner(System.in);
		String guess = scanner.nextLine();
		
		while(!guess.equals(password))
		{
			
			System.out.println("Guess the password:");
			guess= scanner.nextLine();
		}
		System.out.println("congrats");
		scanner.close();
		
		
		//do while run only once
		
	
		
		
	}

}
