// Introduction to The LinkList
import java.util.*;
class Linklisteg
{
	public static void main(String args[])
	{
		String[] things={"Hello ", "Sonu ", "Monu ", " Thids ", "Hell ", " Heven "};
		List<String> list1= new LinkedList<String>();
		
		for(String x : things)
		{
			list1.add(x);
		}
		
		String[] things2= {"Shaikh ", "Shahabaj ", "Khan ", "Salman"};
		List<String> list2= new LinkedList<String>();
		
		for(String y : things2)
		{
			list2.add(y);
		}
		
		list1.addAll(list2);
		list2= null;
		
		printMe(list1);
		removeStuff(list1, 2,5);
		printMe(list1);
		reverseMe(list1);
	}
	private static void printMe(List<String> l)
	{
		for(String x : l)
		{
			System.out.printf("%s ", x);
		}
		System.out.println();
	}
	private static void removeStuff(List<String> l, int from , int to)
	{
		l.subList(from, to).clear();
	}
	private static void reverseMe(List<String> l)
	{
		ListIterator sony = l.listIterator(l.size());
		while(sony.hasPrevious());
		System.out.printf("%s ",sony.previous());
	}
}