package hello;

import java.util.Scanner;

public class MyProgram {

	public static void main(String[] args) {
		System.out.println("What is your name ?"); 
	
		//type identifier = new type();
	    Scanner scanner = new Scanner(System.in);
	    String name = scanner.nextLine();
	    System.out.println("hello" +name);
	    
	  //  String string = new String("This is a string");
	   // String easier ="Wow, that was easy !" + string ;
	    
	    int x=5;//primitive
	    Integer y=5;//object (5 is autoboxed)
	    System.out.println(x);
	    System.out.println(y);
	    scanner.close();
	}
  
}



//primitive types 
//objects


//data type = the type of the data .how the computer interprets the data
//Statically typed =variables are given data types up front (before compiling)
//dynamically typed = variables do not have types 

//literals -the value
//variable- stores some value
//expression -evaluates to a value
//operator -work on operands to produce a value
//operand- the things the operator works on

//comment
//System.out.println("Hello"+ args[0]);
//class -contains everything -has members
//methods -do something
//Arguments -what you pass to a method(part of he calling)
//Parameter- Variable to store arguments(parts of the definitions)
//properties -store something
//access modifier(public)-who can use?
//static-no instance of class is needed
//object-instance of class