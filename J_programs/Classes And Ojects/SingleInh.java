// program to Addition of threee numbers using single inheristances
class class1
{
	int n1=10;
	void show()
	{
		System.out.println("First Number is The : "+n1);
	}
	
}
class class2 extends class1
{
	void add()
	{
		int n2=90,n3=89;
		System.out.println("Second Number is the  : "+n2);
		System.out.println("Thirds Number is the  : "+n3);
        int sum = n1+n2+n3;
        System.out.println("Sum of the Three Numbers is : "+sum);		
	}
}
class SingleInh
{
	public static void main(String arg[])
	{
		class2 obj=new class2();
		obj.show();
		obj.add();
	}
}