// Character Extraction charAt() and getChars()
class charAtDemo
{
	public static void main(String args[])
	{
		// charAt()
		char ch = "abc".charAt(1);
		System.out.println("ch : "+ch);
		
		
		// getChars()
		
		String s = "This is the Demo of the getChars method";
		
		char buf[]= new char[8-4];
		
		s.getChars(4,8,buf,0);
		System.out.println(buf);
	}
}