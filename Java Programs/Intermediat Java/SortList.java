// Sorting LIst
import java.util.*;
class SortList
{
	public static void main(String args[])
	{
		String[] sonu = {"Appple", "HIke", "WhatsApps", "Laptop","Microsoft"};
		List <String> l1= Arrays.asList(sonu);
		
		
		Collections.sort(l1);
		System.out.printf(" %s \n", l1);
		
		Collections.sort(l1, Collections.reverseOrder());
		System.out.printf("%s \n", l1);
		
	}
}