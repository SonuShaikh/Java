//String Tokenizer
import java.util.*;
class StringTokenEx{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		StringTokenizer st;
		String str;
		str = scan.nextLine();
		st = new StringTokenizer(str,".'!_,'? ");
		int tokenCount = st.countTokens();
		System.out.println(tokenCount);
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}