// Compute the hypotenuse of a right triangle.
 import static java.lang.Math.*;
 import static java.lang.System.out;
 class Hypot 
 {
	 public static void main(String args[])
	 {
		 double side1, side2;
		 double hypot;
		 side1 = 10.44;
		 side2 = 30.22;
		 hypot = sqrt(pow(side1,2)+pow(side2,2));
		 out.println("The First Side is : "+side1+" Second side " +side2+ " And Hypot is "+hypot);
	 }
 }