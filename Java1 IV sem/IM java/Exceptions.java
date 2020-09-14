//Exceptions
import java.io.*;
class Exceptions{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("ENter the ");
			int a = Integer.parseInt(br.readLine());
			System.out.println("ENte");
			int b = Integer.parseInt(br.readLine());
			int c = a/b;
			int d[] = new int[0];
				d[0] = c;
		}catch(IOException e){
			System.out.println("Input Output Exception");
		}catch(NumberFormatException e){
			System.out.println("NumberFormatException ");
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException");
		}
	}
}