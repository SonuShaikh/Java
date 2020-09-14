// use of the final Keyword int the class for the methodes
class First1
{
	 final int  a=10;
	final void show()
	{
		 
	System.out.println("A : "+a);
	}
	
}
class Second1 extends First{
	void show()
	{
	System.out.println(" sonu monu in secne clsaa" );
	}
}
class finaleg1
{
	public static void main(String args[])
	{
		Second obj=new Second();
		obj.show();
	}
}