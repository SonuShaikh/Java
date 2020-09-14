import java.math.*;
import java.util.*;
class BigIntegers{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		BigInteger a ,b,c;
		String str1 = scan.nextLine();//"1234567899999999999999999999999999999999999999999999999999999999999999999999999999999";
		String str2 = scan.nextLine();//"20";//"987654321";
		a = new BigInteger(str1);
		b = new BigInteger(str2);
		
		c = a.max(b);
		// ==
		if(c.equals(num1))
			System.out.println();
		else
			System.out.println("0");
		
	    /* if(a.equals(b) == false)
			System.out.println("1");
		else
			System.out.println("0"); */
		
		/* if(a.compareTo(BigInteger.ZERO) || b.compareTo(BigInteger.ZERO) ){
			System.out.println("Smaller Than Zero");
		}else{
			System.out.println("Granted.");
		}  */
	}
}