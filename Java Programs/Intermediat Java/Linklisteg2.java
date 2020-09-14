// introductin to LInkedlist
import java.util.*;
class Linklisteg2
{
	// PrintMe Method
	
	private static void printMe(List<String> l)
	{
		for(String x : l)
		{
			System.out.printf("%s ", x);
		}
		System.out.println();
	}
	
	//Remove stuff Method
	private static void removeStuff(List<String> l, int start, int end)
	{
		l.subList(start,end).clear();
	}
	
	// ReversMe Mathod
	
	private static void reverceMe(List<String> l)
	{
		ListIterator buddy = l.listIterator(l.size());
		while(buddy.hasPrevious())
		{
			System.out.printf("%s ",buddy.previous());
		}
	}
	public static void main(String args[])
	{
		String[] sonu={"java", "Anita", "Bob", "Apple", "Salman", "Khan"};
		List<String> sonuStuff = new LinkedList<String> ();
		for(String x : sonu)
		{
			sonuStuff.add(x);
		}
		
		String[] monu={"Laptop", "Apple IMac", "I pod", "I phone"};
		List<String> AppleStuff=new LinkedList<String>();
		
		for(String y : monu)
		{
			AppleStuff.add(y);
		}
		
		sonuStuff.addAll(AppleStuff);
		AppleStuff = null;
		
		
		printMe(sonuStuff);
		removeStuff(sonuStuff,1,2);
		printMe(sonuStuff);
		reverceMe(sonuStuff);
		
	}
}