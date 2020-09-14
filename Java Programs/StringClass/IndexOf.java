// demonstrate use of the indexOf() lastindexOf()
class IndexOf
{
	public static void main(String args[])
	{
		String s = "Now is the time for all good man to come to aid of there contry";
		
		System.out.println("indexOf(t)"+s.indexOf('t'));
		System.out.println("lastIndexOf(t)"+s.lastIndexOf('t'));
		System.out.println("idexof(the)"+ s.indexOf("the"));
		System.out.println("lastidexOf(the)"+ s.lastIndexOf("the"));
	}
}