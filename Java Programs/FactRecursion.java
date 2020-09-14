//Find out the Factorial of n number Using Recursion
import java.io.*;
class Factorial{
	public int Fact(int a){
		int n = a;
		int f;
		
		if(n == 1)
			return 1;
		else
			return f = Fact(n-1)*n;	
	}
}

class FactRecursion{
	public static void main(String[] args) throws IOException{
		int n;
			Factorial f = new Factorial();
			
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Enter the Number That You Want Factorial");
				n = Integer.parseInt(br.readLine());
				System.out.println("Factorial of "+n+" is : "+f.Fact(n));
		}catch(NumberFormatException e){
			System.out.println("You Cant Do that");
		}
	}
}