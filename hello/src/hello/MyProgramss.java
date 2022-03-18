package hello;

import java.util.ArrayList;
import java.util.List;

public class MyProgramss {

	public static void main(String[] args) {
		//creating Arraylist
		Users me  = new Users();
		me.setFirstName("Sharon");
		me.setLastName("Shelke");
		// System.out.println(me.output(true));
		//Users you = new Users();
	    //you.setFirstName("Sub");
	    //you.setLastName("Scriber");
		String[] firstNames= {"Sharon","sally","emily"};
		String[] lastNames= {"Shelke","john","peter"};
		
		
		List<Users> users =new ArrayList<Users>();
		for(int i = 0 ; i < firstNames.length; i++) {
			Users u = new Users();
			u.setFirstName(firstNames[i]);
			u.setLastName(lastNames[i]);
			users.add(u);
			
		}
		//users.add(you);
		//users.add(me);
		for(Users u : users) {
			System.out.println(u.getFulName());
			
			
		}
		
		//public static int serachList(List<Users>users,String fulName) {
		Object you = null;
		System.out.println(me.equals(you));
		
		//System.out.println(users.get(1).getFulName());
		
	//Users u;
	//Users.printUsers(u);
		
		MyProgramss m = new MyProgramss();
		m.printUser(users.get(0));
	}

	private void printUser(Users users) {
		// TODO Auto-generated method stub
		
	}
	
	

		
	

	//private void printUser(Users u) {
	
	//System.out.println(me.equals(you));
		
	
	
}

