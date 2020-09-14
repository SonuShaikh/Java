//Demonstate Date class
import java.util.*;
class UseDate{
	public static void main(String[] args){
		Date d = new Date();
		System.out.println(d);
		long msec = d.getTime();
		System.out.println("MiliSecond :"+msec);
	}
}
/*
output :
Sat Aug 27 15:44:21 IST 2016
MiliSecond :1472292861301
*/