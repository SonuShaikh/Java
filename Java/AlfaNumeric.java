//Analyze Alfa-Numeric
import java.io.*;
import java.util.*;
class AlfaNumeric{
	public static void main(String[] args){
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);
        char[] charArray;
		String output = "";
		String tempnum = "";
		int i,j;
		try{
			//String inputDate = br.readLine();
			String inputData = scan.nextLine();
			charArray = inputData.toCharArray();
			for(i = 0; i < charArray.length;i++){
				if(Character.isLetter(charArray[i])){
					int asciivalue = (int) charArray[i];
					if(asciivalue % 2 == 0)
						output += "1";
					else
					    output += "0";
				}else if(Character.isDigit(charArray[i])){
					tempnum += Character.toString(charArray[i]);
					for(j = i+1; j < charArray.length; j++){
						if(Character.isDigit(charArray[j])){
							tempnum += Character.toString(charArray[j]);
							charArray[j] = '+';
						}else{
							break;
						}
					} 
					   int num = Integer.parseInt(tempnum);
						if(num % 2 == 0)
							output += "1";
						else
							output += "0";
					tempnum = "";
				}
			}
			System.out.println(output);
		}catch(Exception e){System.out.println(e);}
	}
}