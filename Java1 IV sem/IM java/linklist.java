// collection of the linklist
import java.util.*;
class linklist
{
	public static void main(String arg[])
	{
		String[] things={"sonu","monu" , "Shahid" , "image" , "start"};
		List<String> list1=new LinkedList<String>();
		for(String x: things)
		{list1.add(x);}
	String things2[]={"sugar" , "preety cool" , "Harry Potter"};
	List<String> list2=new LinkedList<String>();
	for(String y: things2)
	{
		list2.add(y);
	}
	list1.addAll(list2);
	list2=null;
	printMe(list1);
	removeStuff(list1,2,5);
	printMe(list1);
	reverseMe(list1);
		}
		// printMe method
		private static void printMe(List<String> l){
			for(String b:l)
				System.out.printf("%s ", b);
			System.out.println();
		}
		private static void removeStuff(List<String> l, int from , int to)
		{
			l.subList(from,to).clear();
		}
		private static void reverseMe(List<String> l){
			ListIterator<String> bobby= l.listIterator(l.size());
			while(bobby.hasPrevious())
				System.out.printf("%s ",bobby.previous());
		}
}