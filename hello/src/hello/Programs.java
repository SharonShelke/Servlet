package hello;

import java.util.ArrayList;
import java.util.List;

public class Programs {

	public static void main(String[] args) {
		Users me = new Users();
		me.setFirstName("Sharon");
		me.setLastName("Shelke");
		
		Users you = new Users();
		you.setFirstName("Not");
		you.setLastName("Me");
		
		List<Users> users = new ArrayList<Users>();
		users.add(me);
		users.add(you);
		
		//int y = 4;
		//Users.changeCrap(y);
	//	System.out.println(y);
		

	}

}
