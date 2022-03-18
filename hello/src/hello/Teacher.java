package hello;

public class Teacher  extends inuser implements Talk{
public String name;
public String names;

	//polymorphism
	 @Override  
	 public void sayHello(){
		 System.out.println("I am a teacher");
	 }
	 
}
