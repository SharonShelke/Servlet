
public class Hello {

	
	public static void main(String[] args) {
		System.out.println("Hello World");
   //Variables
		int num = 4;
		double doubley =4.6;
		String name ="nissi";
		boolean isHome=false;
		char firstInital='s';
//		System.out.println(num);
//        System.out.println(doubley);
//		System.out.println(name);
//		System.out.println(isHome);
//		System.out.println(firstInital);
		
		if(!isHome || num < 18) {
			System.out.println("you are nt ault");
		}
		
		
		if(name.equals("ninu")) {
			System.out.println("Happy Birthday");
			
		}
		else {
			System.out.println("Have a nice day");
	}
		
		while(num <18) {
			System.out.println("you are nt ault");
			//num++;
			num = num+1;
		}
      for(int i = 0 ;i <20; i++) {
    	  System.out.println(i);
      }
      
      int x =0;
     do {
    	  
    	 System.out.println("Happy 4 th");
    	  x++;
      }while(x<10);
}
	
	
	
}
