class NonGen
{
	object ob;
	NonGen(object o)
	{
		ob = o;
	}
	void showData()
	{
		System.out.println("The Data is : "+ob);
	}
	void showType()
	{
		System.out.println("The Type of the Object is : "+ob.getClass().getName());
	}
}
class NonGenDemo
{
	public static void main(String args[])
	{
		NonGen ob = new NonGen(100);
		ob.showData();
		ob.showType();
		NonGen ob1 = new NonGen("STirng Data");
		ob.showData();
		ob.showType();
		
	}
}