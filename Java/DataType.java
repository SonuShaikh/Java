/* Bytes Range  -128 and 127
Short Range -32768 and 32767
Int Range  -2,147,483,648 and 2,147,484,647 */
import java.util.*;
class DataType{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n != 0){
			try{
				long data = scan.nextLong();
				System.out.println(data+" can be fitted In");
				if((data >= -128) && (data =< 127)) 
					System.out.println(" * Byte");
				if(data >= -32768 && data =< 32767 ) 
					System.out.println(" * short");
				if(data >= -2147483648 && data =< 214748364) 
					System.out.println(" * Byte");
				n--;
			}catch(NumberFormatException e){}		
		}
	}
}