class error
{
	public static void main(String arg[])
	{
		try{
	int a=10; 
	int b=a/0;
	System.out.println("divison"+b);
}
catch(Exception e){System.out.println(e);}
	}
}