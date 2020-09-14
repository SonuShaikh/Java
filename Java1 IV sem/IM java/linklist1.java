// convert the linked to the Array
import java.util.*;
class linklist1
{
	public static void main(String arg[])
	{
		String sonu[]={"Sonu", "Anita", "Shaikh"};
		LinkedList<String> thelist=new LinkedList<String>(Arrays.asList(sonu));
		
		thelist.add("First kiss ");
		thelist.addFirst("hate it");
		// convert it back to Array
		sonu=thelist.toArray(new String[thelist.size()]);
		
	}
}