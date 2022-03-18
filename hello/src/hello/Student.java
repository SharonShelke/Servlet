package hello;

public class Student  extends inuser implements Talk{
	public boolean verified= true;
	
	public String major;
	public Student() { //constructor no return type has to match the class
		System.out.println("creating a student");
	}
	
	

	@Override
	public void sayHello() {
		super.sayHello();
	  // System.out.println("Hi my major is " + major + ".My name is" + firstName + " ");
	}
}
