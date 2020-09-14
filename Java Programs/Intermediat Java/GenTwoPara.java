// Geniric class with two Parameters
class GenTwo<T , V>
{
	T x;
	V y;
	// Declaring the The Constuctor
	GenTwo(T a, V b)
	{
		x =a;
		y =b;
	}
	void showType()
	{
		System.out.println("The Type of the  is "+x.getClass().getName());
		System.out.println("The Type of The  is "+y.getClass().getName());
	}
	T getData1()
	{
		return x;
	}
	V getData2()
	{
		return y;
	}
}
class GenTwoPara
{
	public static void main(String args[])
	{
		GenTwo<Integer, String> ob = new GenTwo(100, "Sonu Shaikh");
		ob.showType();
		int v = ob.getData1();
		System.out.println("The Values is : "+v);
		String h = ob.getData2();
		System.out.println("The Value is : "+h);
	}
}