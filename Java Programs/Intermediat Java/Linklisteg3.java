// LinkLIst for integer values
import java.util.*;
class Linklisteg3
{
	public static void main(String args[])
	{
		int[] intnum = {1,2,3,4,5,6,7,8};
		List<Integer> intList= new LinkedList<Integer> ();
		for(int i : intnum)
			intList.add(i);
		
		int[] intnum2 ={7,8,9,10};
		List<Integer> intList2= new LinkedList<Integer>();
		for(int j : intnum2)
			intList2.add(j);
		
		
		// Combining both into single List
		
		intList.addAll(intList2);
		
		ShowMe(intList);
		RemoveMe(intList,6,7);
		ShowMe(intList);
		RverceMe(intList);
		
	}
	
	private static void ShowMe(List<Integer> l)
	{
		for(int a : l)
		{
			System.out.printf("%d ",a);
		}
		System.out.println();
	}
	
	// RemoveMe method
	private static void RemoveMe(List<Integer> l, int start, int end)
	{
		l.subList(start,end).clear();
	}
	
	// Reverce Me Method
	
	private static void RverceMe(List<Integer> l)
	{
		ListIterator sonu = l.listIterator(l.size());
		while(sonu.hasPrevious())
		{
			System.out.printf("%d ",sonu.previous());
		}
	}
}