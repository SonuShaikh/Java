// Genirics
class Gen<T>
{
	T ob;
	
	Gen(T o)
	{
		ob = o;
	}
	
	void getType()
	{
		System.out.println("The Type of the Object is : "+ob.getClass().getName());
	}
	void getData()
	{
		System.out.println("The Data is : "+ob);
	}
}
class GenDemo
{
	public static void main(String args[])
	{
		Gen <Integer> ob;
		ob = new Gen<Integer> (100);
		ob.getType();
		ob.getData();
		Gen<String> str = new Gen<String>("Geniric Class");
		str.getType();
		str.getData();
	}
}