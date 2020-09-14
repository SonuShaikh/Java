// Write program to accept a line of text and print the total number of uppercase 
// and lowercase letters, whitespace,symbal
import java.io.*;
class CharMeth{
	    static int Dcount=0 , LLcount = 0, ULcount = 0,Wcount = 0,Scount = 0;
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Line Text Which include letters,space,SpecialChar");
		String source = br.readLine();
		int sl = source.length();
		char a[] = new char[sl];
		source.getChars(0,source.length(),a,0);
		
		
		for(int i =0; i<a.length;i++){
			if(Character.isDigit(a[i])){
				Dcount++;
			}else if (Character.isLetter(a[i])){
				if(Character.isUpperCase(a[i])){
					ULcount++;
				}else{
					LLcount++;
				}
				
			} else if(Character.isWhitespace(a[i])){
			    Wcount++;
			} else {
				Scount++;
			}
		
		}
		System.out.println();
		System.out.println("Total Number of Digit "+Dcount);
		System.out.println("Total Number of UpperCase Latter "+ULcount);
		System.out.println("Total Number of LowerCase Latter "+LLcount);
		System.out.println("Total Number of Whitespace "+Wcount);
		System.out.println("Total Number of SpecialChar "+Scount);
	}
}
/*
Output :
Enter The Line Text Which include letters,space,SpecialChar
Sonu.Shaikh.9028@gmail.com

Total Number of Digit 4
Total Number of UpperCase Latter 2
Total Number of LowerCase Latter 16
Total Number of Whitespace 0
Total Number of SpecialChar 4
*/