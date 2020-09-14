// Demonstrate Reverse
import java.io.*;
class ReverseNum{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Any Positive Integer Number");
		int n = Integer.parseInt(br.readLine());
		//String rn = n.reverse();
		int rn = Integer.reverse(n);
		System.out.println(rn);
		if(n == rn){
			System.out.println("Number Is A Magic Number");
		}
		else
		{
			System.out.println("Number is Not A Magic Number");
		}
	}
}