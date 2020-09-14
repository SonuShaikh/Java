// program to Perform a String Manipulation on Shaikh Shahabaj
import java.lang.*;
import java.io.*;
class Manipulation_String
{
	public static void main(String args[])
	{ 
	    String s2;
		String s1="Shaikh Shahabaj";
		System.out.println("String Manipulation Are:");
		System.out.println();
		/* String s2=s1.length();
		System.out.println("The length of the "+s1+" Is :"+s2); */
		s2=s1.toLowerCase();
		System.out.println("The Lower case of the String:"+s2);
		System.out.println();
		s2=s1.toUpperCase();
		System.out.println("In Uppercase String are:"+s2);
        System.out.println();
		s2=s1.replace('S','A');
		System.out.println("After the Replacing the String :"+s2);
		System.out.println();
		char ch=s1.charAt(2);
		System.out.println("At 2 position Charecter is the :"+ch);
		System.out.println();
		s2=s1.concat(" Mubarak");
		System.out.println("Afer the Cancatanation String is:"+s2);
		System.out.println();
		s2=s1.substring(6);// use to divid the string from the original String
		System.out.println("Thea sub Sting of "+s1+ " is : " +s2);
		System.out.println();
		s2=s1.substring(7,15);// use to divid the string from the original String with specific location
		System.out.println("Thea sub Sting of "+s1+ " is : " +s2);
		
		s2="Shaikh Shahabaj";
		System.out.println();
		if(s1.equals(s2))
		{
			System.out.println("The String "+s1+" AND "+s2+ " Are Equals");
		}
		else 
		{
			System.out.println("The String "+s1+" AND "+s2+ " Are  not Equals");
		}
		if(s1.equalsIgnoreCase("shaikh shahabaj"))
		{
			System.out.println("The String "+s1+" AND "+s2+ " Are Equal");
		}
		else
		{
			System.out.println("The String "+s1+" AND "+s2+ " Are  not Equla");
		}
		
		
	}
}