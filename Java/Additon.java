import java.io.*;
class Addition{
	public static void main(String[] args) throws IOException{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your First Number");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter Your Second Number");
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("Additon : "+(a+b));
		
	}
}