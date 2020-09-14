// Collection Example for Name
import java.util.*;
class CollectionName
{
	public static void editlist(Collection <String> l1, Collection <String> l2)
	{
		Iterator <String>  it=  l1.iterator();
		while(it.hasNext())
		{
			if(l2.contains(it.next()));
			{
				it.remove();
			}
		}
	}
	public static void main(String args[])
	{
		String Name[]={"Sonu ", "Shahabaj ", "Kale ", " Sahil ", "Ayan ","Salman "};
		
		List<String> list1= new ArrayList<String> ();
		
		
		for(String x : Name)
		{
			list1.add(x);
		}
		
		
		String Name2[]={"Sonu ", "Shahabaj ", "Kale "};
		List<String> list2= new ArrayList<String> ();
		
		for(String y : Name2)
		{
			list2.add(y);
		}
		
		for(int i=0; i<list1.size(); i++)
		{
			System.out.printf("%s",list1.get(i));
		}
		System.out.println();
		
		editlist(list1 , list2);
		
		for(int i =0; i<list1.size();i++)
		{
			System.out.printf("%s",list1.get(i));
		}
			
	}
 
}