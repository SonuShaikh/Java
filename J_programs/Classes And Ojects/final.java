// use of the final Keyword int the class for the varialbles 
class First
{
	 final int  a=10;
	void show()
	{
		 
	System.out.println("A : "+a);
	}
	
}
class Second extends First{
	void show()
	{
	System.out.println("sYSTEMout println " +(super.a+1));
	}
}
class finaleg
{
	public static void main(String args[])
	{
		Second obj=new Second();
		obj.show();
	}
}