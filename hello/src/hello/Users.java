package hello;

import java.util.Objects;

public class Users {
private String firstName;
private String lastName;


public String output() {
	//for(int i = 0; i < times; i++) {
	return "HI, my name is " + firstName + " " +lastName +".";
}

// public String output (boolean nice) {
	// if(nice) {
	//	 return "You are  a freak.-" + getFulName() + ".";

	
	


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
  
  static void printUsers(Users u) {
		System.out.println(u.getFulName());
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}

@Override
public int hashCode() {
	return Objects.hash(firstName, lastName);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Users other = (Users) obj;
	return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
}
 
 

//public static void changeCrap(int y) {
	// TODO Auto-generated method stub
//	y = new Users();
//	y.setFirstName("Changes");
}

