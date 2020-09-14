// HashSet
import java.util.*;
class SetHash
{
	public static void main(String args[])
	{
		Integer sonu[] = {1,2,3,4,5,1,2,3,4,5};
		List<Integer> list=  Arrays.asList(sonu);
		
		System.out.printf("%s ", list);
		System.out.println();
		
		Set<Integer> set = new HashSet<Integer>(list);
		
		System.out.printf("%s ",set);
		
		
	}
}