package hello;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		
		String password ="let me in";
		Scanner scanner = new Scanner(System.in);
		String guess;
		do
		{
			System.out.println("Guess the password:");
			guess= scanner.nextLine();
		} while(!guess.equals(password));
		
		System.out.println("congrats");
		scanner.close();

	}

}
