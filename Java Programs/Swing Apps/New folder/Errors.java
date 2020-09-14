// Demon Excepton
import java.io.*;
import java.util.*;
class Errors{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 1;
		do{
			try{
			System.out.println("Enter The First Number");
			int a = Integer.parseInt(br.readLine());
			System.out.println("Enter The Second Number");
			int b = Integer.parseInt(br.readLine());
			int c = a/b;
			
			System.out.printf("Division of %d and %d is = %d",a,b,c);
			x = 2;
		}
		catch(NumberFormatException e){
			System.out.println(e.getMessage()+" You Can't Enter The String or Char");
		}
		catch(ArithmeticException e){
			System.out.println("You Can't Divide By Zero. Try Other Number");
		}
		}while(x == 1);
	}
}