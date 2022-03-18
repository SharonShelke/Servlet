//inhertiance
public class I {
    public void m1() {
    	System.out.println("Parent");
    }
}
 class J extends I{
	 public void m2() {
		 System.out.println("Child"); 
	 }
 }
 
 
 class Inherti{
	 public static void main(String[]args) {
	//	 I ii= new I();
		 J jj = new J();
	//	 ii.m1();
		// ii.m2(); on child refer u can call both
		 jj.m1();
		 jj.m2();
		  I ii = new J();
	//cant be done	  J jj = new I();
	 }
 }