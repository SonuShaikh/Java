// Introduction to colloction
import java.util.*;
class Collections
{
	 public static void editlist(Collection <String> l1, Collection <String> l2)
	 {
		 Iterator <String> it = l1.iterator();
		 while(it.hasNext())
		 {
			 if(l2.contains(it.next()))
			 {
				 it.remove();
			 }
		 }
	 }
	public static void main(String args[])
	{
		try{
		String[] things={"Iphone ", "Imac ", " Ipad ", "Ipod ", "Itune "};
		List <String> list1 = new ArrayList<String>();
		
		for(String x : things)
		{
			list1.add(x);
		}
		
		
		String[] moreThing ={"Iphone ", "Ipod "};
		List<String> list2= new ArrayList<String>();
		
		
		for(String y : moreThing)
		{
			list2.add(y);
		}
		
		for(int i=0; i<list1.size();i++)
		{
			System.out.printf("%s",list1.get(i));
		}
		  System.out.println();
		  
		  editlist(list1, list2);
		  
		  for(int i=0 ; i<list1.size();i++)
		  {
			  System.out.printf("%s",list1.get(i));
		  }
		
		}catch(ArrayIndexOutOfBoundsException e)
		
		{
			System.out.println("Array Index Out of Range");
		}
	}
}