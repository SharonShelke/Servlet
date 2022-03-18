package hello;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		String x ="hello cats";//string is a class not primitive type.object (instance of class)
		System.out.println(x + " and dogs");
		String name= "Sharon";
		System.out.println(String.format("hello %s", name));
	  System.out.println(name.length()); 
	  
	  
	//String Method
	  String y = "yummmm...my oh my chicken pot pie";
	  System.out.println(y.charAt(y.length() -1));
	 String fullAd = y + "Now with 20%  more chicken";
	 System.out.println(fullAd);
	System.out.println(fullAd.contains("chicken"));
	System.out.println(fullAd.indexOf("my", fullAd.indexOf("my") + 1));
	  System.out.println(fullAd.lastIndexOf("my"));
	  
	  //examples of common string method
	  String fullAt = "yummmm...my oh my chicken pot pie  Now with 20%  more chicken";
	  System.out.println(fullAt.toUpperCase());
	  System.out.println(fullAt.toLowerCase());
	  System.out.println(fullAt.strip());
	  System.out.println(fullAt.substring(9, 17));
	  System.out.println(fullAt.repeat(300));
	//  String password = "let me in";
	  System.out.println("Guess the password:");
	  //input
	 // Scanner scanner = new  Scanner(System.in);
	//  String guess = scanner.nextLine();
	//  System.out.println(password.equals(guess));
	  
	//  scanner.close();
	  
	  //String comparison
	  
	  String pass ="let me in";
	  System.out.println("Guess the password:");
	  //input
	  Scanner scanner = new  Scanner(System.in);
	  String gues = scanner.nextLine();
	  System.out.println(pass.equals(gues));
	System.out.println(pass==gues);
	  scanner.close();
	}
	
	
	
	//primitives - this works
	//int x= 5;
	//object -this doesnt work
	//String x = new String("this is an object");
	//the values object  contains is a reference to the object
	
	
	

}

