// HashSet
import java.util.*;
class Hashseteg
{
	public static void main(String args[])
	{
		String[] sonu = {"Sonu", "Monu", "Shaikh", "Sonu", "Apple"};
		
		List<String> list = Arrays.asList(sonu);
		
		System.out.printf("%s ", list);
		
		System.out.println();
		
		Set<String> set = new HashSet<String>(list);
		
		System.out.printf("%s ", set);
		
	}
}