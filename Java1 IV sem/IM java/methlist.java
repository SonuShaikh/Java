// program to methods of the list
import java.util.*;
class methlist
{
	public static void main(String arg[])
	{
		Character sonu[]={'s','o','n','u'};
		List<Character> list = Arrays.asList(sonu);
		System.out.println("List is:");
		output(list);
		
	// print in reverese order
	Collections.reverse(list);
	System.out.println("After the Revers:");
	output(list);
	// Copied new Array
	Character anita[]=new Character[4];
	List<Character> list2= Arrays.asList(anita);
	
	System.out.println("Copied Arrays");
	Collections.copy(list2,list);
	output(list2);
	
	// fill method
	Collections.fill(list,'A');
	System.out.println("Afret the fill");
		
	}
	private static void output(List<Character> l )
	{
		for(Character monu: l)
			System.out.printf("%s ", monu);
		System.out.println();
	}
}