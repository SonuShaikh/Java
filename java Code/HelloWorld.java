import java.io.*;
class HelloWorld{
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("What is you name??");
			String name = br.readLine();
			System.out.println("What is your girlfiend's name??");
			String gf = br.readLine();
			System.out.println("What is your phone number ???");
			double num = Double.parseDouble(br.readLine());
			System.out.println("Okay.. We are Done. \n\n\n\n");
			System.out.println("Your Name is "+name);
			System.out.println("Your Girl Friend Name is "+gf);
			System.out.println("And YOur phone noumberis "+num);
			
			
		}catch(Exception e){
			System.out.println("Exception Cought "+e);
		}
	}
}