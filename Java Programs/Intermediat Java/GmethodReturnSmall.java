// write a program to find smallest nu ouut of 3 nubers make use of the Geniric methods
class GmethodreturnSmall
{
	private static <G extends Comparable<G>> G Min(G a, G b , G c)
	{
		G s = a;
		if(b.compareTo(a)< 0)
			s = a;
		if(c.compareTo(s)<0)
			s=c;
		return s;
	}
	public static void main(String args[])
	{
		System.out.println(Min(10,20,30));
		System.out.println(Min("Sonu", "Shaikh", "Mubarak"));
	}
}