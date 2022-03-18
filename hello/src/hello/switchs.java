package hello;

import java.util.Scanner;

public class switchs {

	public static void main(String[] args) {
		System.out.println("What's your name ?");
		  Scanner scanner = new Scanner(System.in);
		  String name  = scanner.nextLine();
		  
		  switch(name)
		  {
		  case "Sharon":
			 System.out.println("Welcome");
			   break;
		  case "Clare":
		  case "Nissi":
			  System.out.println("Go away");
			  break;
			default:
				System.out.println("Try again later");
				 break;
				 
				
				
		  }
	}

}
