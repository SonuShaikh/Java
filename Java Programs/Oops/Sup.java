// Write program on Super Keyword
class Sup
{
	String Name;
	String Lname;
	
	Sup(String N, String Ln)
	{
		Name = N;
		Lname = Ln;
	}
}
class baseSup extends Sup
{
	String Fname;
	baseSup(String N, String Ln, String Fn)
	{
		super(N,Ln);
		Fname=Fn;
	}
	void display()
	{
		System.out.println(" First Name : "+Name);
		System.out.println(" Fathere's Name : "+Fname);
		System.out.println(" Last Name : "+Lname);
	}
}
class SupMain
{
	public static void main(String args[])
	{
		baseSup obj = new baseSup("Sonu","Shaikh","Mubarak");
		obj.display();
	}
}