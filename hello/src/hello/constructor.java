package hello;

import java.lang.reflect.Constructor;

public class constructor {
	public String firstName;
	public String lastName;
	public String id;
	public String department;
	
	public constructor() {
		
	}
	
	public constructor(String firstName, String lastName, String id , String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.department = department;
		
		System.out.println("First Name : " + firstName);
		System.out.println("Last Name  : " + lastName);
		System.out.println("Id         : " + id);
		System.out.println("Department : " + department);
	}
	
	
	public static void main(String args[]) {
		constructor con = new constructor("Sharon", "Shelke", "24", "Java");
	}
}


