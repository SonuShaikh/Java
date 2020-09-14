// program to sort the list
import java.util.*;
class sortlist
{
	public static void main(String arg[])
	{
		String[] sonu={"sonu", "monu", "Anita" ,"Laptop" ,"lopipop"};
		List<String> list=Arrays.asList(sonu);
		System.out.println("List :" +list);
		Collections.sort(list);
		System.out.println("The sorted List:"+list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("RevereseOrder list"+list);
	}
}