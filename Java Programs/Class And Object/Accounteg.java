// write a program to create a class Accoutn having data members as Acc_no, name and balance. Accept and display data for one object
class Account
{
	int Acc_no;
	double balance;
	String name;
	
	void getData(int A, double B  , String N)
	{
		Acc_no =A;
		balance = B;
		name = N;
	}
	void Show()
	{
		System.out.println("Account Number is : "+Acc_no);
		System.out.println("Balance is : "+balance);
		System.out.println(" Name of the of the Customer : "+name);
	}
}
class Accounteg
{
	public static void main(String args[])
	{
		Account obj= new Account();
		obj.getData(12345, 15235.00, " Sonu");
		obj.Show();
	}
}