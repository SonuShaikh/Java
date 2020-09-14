// HOw to convert list to Arryas And Arrays ot list
import java.util.*;
class ArraysToList 
{
	public static void main(String args[])
	{
		String[] sonu= {"Shaikh ", " sonu ", "Apple", "Becone", "Marshal"};
		LinkedList <String> list1 = new LinkedList<String>(Arrays.asList(sonu));
		
		list1.add("Salman Khan");
		list1.addFirst("Shahabaj");
		
		// converting the list into Arrays
		sonu = list1.toArray(new String[list1.size()]);
		
		for(String w : sonu)
		{
			System.out.printf("%s ",w);
		}
	}
}