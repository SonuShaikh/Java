// Genirics Methods With  return Type. Maximum numbers out of Three numbers 
class GmethodReturn
{
	private static < T extends Comparable<T>> T max( T a, T b, T c)
	{
		T m = a;
		if(b.compareTo(a)>0)
			m=b;
		if(c.compareTo(m)>0)
			m=c;
		return m;
	}
	public static void main(String args[])
	{
		System.out.println(max(10,20,30));
		System.out.println(max("Sonu", "Shaikh", "Mubarak"));
		
	}
}