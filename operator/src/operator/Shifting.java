package operator;

public class Shifting {

	 public static void rightshift() {
		 int x=30;
		 System.out.println("value after right shift=" + (x>>2));
		 System.out.println(x);
	 }
	 public static void leftShift() {
		 int x=10;
		 System.out.println("value after left shift=" +(2<<x));
		 System.out.println(x);
	 }
	 public static void main (String []args) {
		 rightshift();
	     leftShift();
	 }
	 
}
