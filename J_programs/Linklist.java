import java.util.*;
class Linklist
{
	public static void main(String arg[])
	{
		String betsman[] ={"Sachin", "Rahul", "Yusuf", "Gayle", "Watsone", "Devileers"};
		LinkedList <String> list= new LinkedList <String> ();
		
		for(String s : betsman)
		{
			list.add(s);
		}
		System.out.println("The Batsemens list");
		for(String p : list)
		{
			System.out.println(p);
		}
		
		String bowler[]={"Zaheer", "Irfan", "Ashwin", " Balaji", "Breacker", " Mohm.shami"};
		LinkedList <String> list2= new LinkedList<String> ();
		
		for(String a: bowler)
		{
			list2.add(a);
		}
		System.out.println("The bowler's List");
		
		for(String f: list2)
		{
			System.out.println(f);
		}
		
		
		
		list.addAll(list2);
		list2= null;
		
		System.out.println("The whole team Lists");
		
		for(String nl: list)
		{
			
			System.out.println(nl);
		}
	}
}