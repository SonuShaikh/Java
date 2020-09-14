//Introduction to collection Or List Or ArrayList<type>
import java.util.*;
class CollectionEx {
	public static void main(String[] args){
		String[] things = {"Cooler", "Fan", "Mixer", "Ac"};
		List<String> list1 = new ArrayList<>();
		
		for(String x: things)
			list1.add(x);
		
		String[] morethings = {"Mixer","Blanket"};
		List<String> list2 = new ArrayList<>();
		
	    for(String y: morethings)
			list2.add(y);
		
		for(int i=0; i<list1.size();i++)
			System.out.println(list1.get(i));
		
		editlist(list1,list2);
		System.out.println();
		for(int i=0; i<list1.size();i++)
			System.out.println(list1.get(i));
	}
	public static void editlist(Collection<String> l1, Collection<String> l2){
		Iterator<String> it = l1.iterator();
		while(it.hasNext())
			if(l2.contains(it.next()))
				it.remove();
	}
	
}