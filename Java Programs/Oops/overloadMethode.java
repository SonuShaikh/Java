// Write a program to demonstrate Use Of the MethodeOverLoading
class overloadM
{
	String name;
	int rollno;
	
	void getData()
	{
		name="Sonu";
		rollno=1;
	}
	void getData(String s, int r)
	{
		name = s;
		rollno = r;
	}
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Roll No : "+rollno);
	}
}
class OverloadMethode
{
	public static void main(String args[])
	{
		overloadM obj= new overloadM();
		obj.getData();
		obj.display();
		overloadM obj1 = new overloadM();
		obj1.getData("Salman",2);
		obj1.display();
	}
}