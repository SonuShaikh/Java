//program to convert time in seconds to time hourse, minuts and seconds
import java.util.*;
class TimeConversion{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Time in Second.");
		int time_sec = s.nextInt();
		double h,sec,m,t;
		h = time_sec /3600;
		t = time_sec %3600;
		m = t/60;
		sec = t%60;
		System.out.println("Time is "+h+":"+m+":"+s);
	}
}