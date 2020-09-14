// Copy the List Example
import java.util.*;
class CopyList
{
	public static void main(String args[])
	{
		Character Ray[]={'S', 'O', 'N', 'U'};
		List<Character> l= Arrays.asList(Ray);
		
		System.out.println("List Is : ");
		output(l);
		
		// reversce and Print out hte LIst
		Collections.reverse(l);
		
		System.out.println("After The Reverce : ");
		
		output(l);
		
		Character[] NewRay= new Character[4];
		List<Character> copyList= Arrays.asList(NewRay);
		
		// copy the list l to copyList
		Collections.copy(copyList,l);
		
		System.out.println("Copying the List");
		output(copyList);
		
		// Fill Methods
		
		Collections.fill(l,'X');
		System.out.println("Aftr The Felling : ");
		output(l);
		
		
	}
	
	private static void output(List<Character> thelist)
	{
		for(Character things : thelist)
		{
			System.out.printf("%s ", things);
		}
		System.out.println();
	}
}