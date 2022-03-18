package hello;

import java.util.ArrayList;
import java.util.List;

public class Inheritance {

	public static void main(String[] args) {
		Student s = new Student();
		s.sayHello();
		List<Talk> thingsThatTalk =new ArrayList<Talk>();
		thingsThatTalk.add(s);
       s.major = " Mustache design";
     //   System.out.println(s.major);
       
       // s.firstName="Sharon";
        //s.lastName="shelke";
        s.sayHello();
       // s.status =s.status.probation;
      //  System.out.println(s.status);
        Teacher t = new Teacher();
        t.name="tech";
        t.names="er";
        
        List<inuser> user =new ArrayList<inuser>();
        user.add(s);
        user.add(t);
        for(inuser u : user) {
        	u.sayHello();
        }
     //switch(s.status) {
     //  case probation:
    	//   System.out.println("ouch");
    	//   break;
    //   case active:
    	//   System.out.println("great");
    	//   break;
   //    case inactive:
   // 	   System.out.println("come back");
   // 	   break;
      
	}
	
//anyting that doesnt exist you can name it as abstract
}
