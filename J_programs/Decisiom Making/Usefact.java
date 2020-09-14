// Defind the Class Factorial with instance varialble n and display the factorila of that number using the class and objects
class Factorial
{
	private int n;
	void fact(int m)
	{
		n=m;
		int facto=n*n;
		System.out.println("The Factorial Of "+n+" is Equlas : "+facto);
	}
}
class Usefact
{
	public static void main(String arg[])
	{
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(system.in));
			System.out.println("Enter the Number You Want : ");
			int n=Integer.parseInt(br.readLine());
			Factorial obj=new Factorial();
			obj.fact(n);
		}catch(Exception e){}
	}
}