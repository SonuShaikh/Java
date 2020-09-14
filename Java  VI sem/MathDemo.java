   //Wtrite a program to calculate sin,cos,tan values of angle 120;
import java.util.*;
class MathDemo{
	public static void main(String[] args){
		double Theta = 120;
		double x = Math.toRadians(Theta);
		
		System.out.println(Theta+" In Randian : "+x);
		System.out.println(x+" In Degree : "+(Math.toDegrees(x)));
		
		System.out.println("Sin(x)"+(Math.sin(x)));
		System.out.println("cos(x)"+(Math.cos(x)));
		System.out.println("tan(x)"+(Math.tan(x)));
	}
}
/*
Output:
120.0 In Randian : 2.0943951023931953
2.0943951023931953 In Degree : 119.99999999999999
Sin(x)0.8660254037844387
cos(x)-0.4999999999999998
tan(x)-1.7320508075688783
*/