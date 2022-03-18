package hello;

public class operator {
   public static void main(String[] args) {
	 //  int a = 5;
	  //double x = (double) a  * 2;
	 // double x = 5.0 /2;
	  //System.out.println(x);
	  /*+ add
	   * -sub ,/div,*multiplication,% modulus
	   */
	  
	//int x = 5%2;
  //System.out.println(x);
  
  //precedence - order evaluated
  //( 5 +3) /2 ) *3 
	   
	   int x =5 ;
	   int a = ++x;
	   System.out.println(x);
       System.out.println(a);
	   
       //assignment operator
       int y = 5;
       y+=20;
     //  y=y+1;
       System.out.println(y);
       
     //method on integer object
       int c =10;
       int d = 20;
       System.out.println(Integer.max(c, d));
	   System.out.println(Integer.compare(c, d));
	   
	   String money ="300";
	   
	   System.out.println(Integer.valueOf(money)); 
	   System.out.println(Integer.parseInt(money));
	   
	   //Integer i = Integer.valueOf(money);
	   //int j = Integer.parseInt(money);
	   
	   
	   //conditional operator
	   
	   String name ="clare";
	//   boolean welcome = name.equals("clare")? true:false;
	   
	   boolean welcome = false;
	   if(name.toLowerCase().equals("clare"))
	   {
		  welcome = true;
	   }
	   System.out.println(welcome);
	
   }
}
