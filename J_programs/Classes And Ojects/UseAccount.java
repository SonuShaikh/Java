// create class Account having the member Acc_no, name and balance. Accept and display the data for one objects use nested methode
class Account
{
	int Acc_no;
	String Name;
	double Balance;
	void getdata(int no,String na, double Ba)
	{
		Acc_no=no;
		Name=na;
		Balance=Ba;
		display();
	}
	void display()
	{
		System.out.println("Account No : "+Acc_no);
		System.out.println("Name : "+Name);
		System.out.println("Balance : "+Balance);
	}
}
class UseAccount
{
	public static void main(String arg[])
	{
		Account obj=new Account();
		obj.getdata(11111,"Shaikh Shahabaj Mubarak",10000000.49);
		
	}
}