//Sub String
import java.util.*;
class SubString{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s;
		int start,end;
		s = scan.nextLine();
		start = scan.nextInt();
		end   = scan.nextInt();
		System.out.println(s.substring(start,end));
	}
}