class numbers
{
	int n1,n2;
	void getdata(int m1,int m2)
	{
		n1=m1;
		n2=m2;
	}
	void putdata()
	{
		System.out.println("First Number Is The  :"+n1);
		System.out.println("Second Number Is The  :"+n2);
	}
}
class add extends numbers
{
	void addition()
	{
		int sum=n1+n2;
		System.out.println("Sum of  "+n1+ "  And  "+n2+ " is the " +sum);
	}
}
class sub extends numbers
{
	void sub()
	{
		int sb=n1-n2;
		System.out.println("Sub of  "+n1+ "  And  "+n2+ " is the " +sb);
	}
}


class arith

{
	public static void main(String arg[])
	{
		sub obj=new sub();
		/* numbers obj1=new numbers() */
		obj.getdata(10,20);
		obj.putdata();
		obj.addition();
	}
}