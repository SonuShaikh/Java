//Demonstrate use of the findInLine
import java.util.*;
class FindInLine{
	public static void main(String[] args){
		String str = "Name Shaikh Age 19 Id 58784";
		Scanner scan = new Scanner(str);
		scan.skip("Name");
		if(scan.hasNext())
			System.out.println(scan.next());
		else
			System.out.println("Error");
	}
}