class Sonuexp extends Exception
{
	Sonuexp(String name)
	{
		System.out.println(name+" Is a User Defined Exception");
	}
}
class sonu
{
	public static void trial(String name) throws Sonuexp{
		if(name== "Sonu")
			throw new Sonuexp(name);
	}
	
	public static void Counter(String n)
	{
		for(String s=n; s<=5; s++)
		{
			System.out.println(s);
			trial(s);
		}
	}
   public static void main(String args[])
   {
	   Counter("Shaikji");
	   Counter("Shaikh");
	   Counter("Sonu");
	   
   }
}