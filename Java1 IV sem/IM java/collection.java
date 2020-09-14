// collection of an Array 	COLLECTION
import java.util.*;
class collection1
{
	public static void main(String arg[])
	{
		String things[]={"sonu", "Pappu","salman" , "Babal", "Saniya"};
		List<String> list1=new ArrayList<String>();
		// add Array item to list1
		for(String x:things)
		{
			list1.add(x);
		}
		String[] morethings={"Saniya ", "Samiya", "aqusa"};
		List<String> list2=new ArrayList<String>();
		// Add Array item to list2
		for(String y:morethings)
			list2.add(y);
		 for(int i=0; i<list1.size();i++){
		 System.out.printf("\n%s",list1.get(i));}
		 
	}
}