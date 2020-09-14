// write program to display product name priduct id price and quality and calculate total amount of product
import java.util.Scanner;
class Useproduct
{
	public static void main(String arg[])
	{
		try{
			Product obj=new Product();
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the value for the Product NAme");
            String s=scan.nextLine();
            System.out.println("Enter the value for the Product ID");
			int id=scan.nextInt();
            System.out.println("Enter the value for the Product price");
			int pr=scan.nextInt();
            System.out.println("Enter the value for the Product Quality");
			int q=scan.nextInt();
			obj.getdata(id,s,pr,q);
			obj.display();
			obj.calculate();
		}catch(Exception e){}
	}
}