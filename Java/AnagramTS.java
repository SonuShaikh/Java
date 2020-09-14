// Two String Anagram
import java.util.*;
class TestAnagram{
	Scanner scan = new Scanner(System.in);
	String s1,s2;
	void getInput(){
		s1 = scan.nextLine().toLowerCase();
		s2 = scan.nextLine().toLowerCase();
        checkAnagram();		
	}
	
	boolean CompareLength(String s1,String s2){
		int a = s1.length();
		int b = s2.length();
		if(a == b)
			return true;
		else
			return false;
	}
	void checkAnagram(){
		if(testAnangram(s1,s2))
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
	}
	boolean testAnangram(String str1,String str2){
		if(CompareLength(s1,s2)){
			
			char[] c1 = str1.toCharArray();
			char[] c2 = str2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1,c2))
				return true;
			else
				return false;
			
			
		}else
			return false;
	}
}
class AnagramTS{
	public static void main(String[] args){
		TestAnagram obj = new TestAnagram();
		obj.getInput();
		
	}
}