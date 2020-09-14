// Demonstrate Charactor Methods
import java.io.*;
class CharMethods{
	public static void main(String[] args)throws IOException{
		char a[] = {'a','1','2','b','e','d','A',' ','?'};
		
		for(int i =0; i<a.length;i++){
			if(Character.isDigit(a[i])){
				System.out.println(a[i]+" is a Digit");
			}else if (Character.isLetter(a[i])){
				if(Character.isUpperCase(a[i])){
					System.out.println(a[i]+" Is Uppercase Letter");
				}else{
					System.out.println(a[i]+" is LowerCase Letter");
				}
				
			} else if(Character.isWhitespace(a[i])){
			    System.out.println(a[i]+" Is WhiteSpace");
			} else {
				System.out.println(a[i]+" is Special Character");
			}
		
		}
	}
}


/*
 output :
a is LowerCase Letter
1 is a Digit
2 is a Digit
b is LowerCase Letter
e is LowerCase Letter
d is LowerCase Letter
A Is Uppercase Letter
  Is WhiteSpace
? is Special Character

*/