package hello;

public class userss {
private String firstName;
private String lastName;

public String output() {
	//for(int i = 0; i < times; i++) {
	return "HI, my name is " + firstName + " " +lastName +".";
}


 public String getFirstName() {
	 return firstName.toUpperCase();
 }
 

  public void setFirstName(String fn) {
	  firstName=fn.strip();
  }
  
  public String getLastName() {
		 return lastName;
	 }
  public void setLastName(String ln) {
	  lastName=ln;
  }
  public String getFulName() {
	  return getFirstName() + " " + lastName;
  }
}


