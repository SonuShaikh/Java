// String Methods
class Index
{
	public static void main (String agrs[])
	{
		String s = "Shaikh Shahabaj Mubarak M";
		System.out.println(s.indexOf('M'));
		System.out.println(s.indexOf('M',17));
		System.out.println(s.indexOf("baj"));
		
		String a = "Sonu ";
		String b = " Shaikh";
		String c = "     Monster    ";
		System.out.println(a.concat(b));
		System.out.println(a.replace('S','M'));
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
		System.out.println(c.trim());
		
	}
}