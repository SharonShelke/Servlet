package hello;

public class inuser {
	public enum status{active,nactive,probation};
private String firstName;
private String lastName;
public boolean verified= false;
public status status;
//public User(String fn,String ln) {
	


//public  void sayHello() -we cant override it it prevents from anything to extend it


public  void sayHello() {
	System.out.println("Hi! I am a user . My name is " + firstName + " "+ lastName + ".");
	System.out.println("User version");
}
}
