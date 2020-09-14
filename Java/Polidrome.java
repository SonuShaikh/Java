// Polidrom
import java.util.*;
class Polidrome{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		StringBuffer sb1 = new StringBuffer(str);
		StringBuffer sb2 = new StringBuffer();
		sb1 = sb1.reverse();
		//System.out.println(sb);
		
		if(sb1.compareTo(sb2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}