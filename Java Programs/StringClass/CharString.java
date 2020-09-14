// String char
class CharString 
{
	public static void main (String args[])
	{
		char Char[] = {'S','O','N','U'};
		String s1 = new String(Char);
		System.out.printf(" %s \n",s1);
		
		char sbs[]= {'J','A','V','A','P','R','O','G','R','A','M','M','I','N','G'};
		String s2 = new String(sbs, 4,11);
		System.out.println(s2);
	}
}