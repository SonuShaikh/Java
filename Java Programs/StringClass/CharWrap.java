// Character Wrap
class CharWrap

{
	public static void main(String args[])
	{
		char a[] = {'A', 'b',' ', '?', '7'};
	
	for(int i = 0; i<a.length ; i++)
	{
		if(Character.isDigit(a[i]))
			System.out.println(a[i]+" is Degite");
		if(Character.isLetter(a[i]))
			System.out.println(a[i]+" is Letter");
		if(Character.isUpperCase(a[i]));
       		System.out.println(a[i]+" is UppareCase later");
		if(Character.isLowerCase(a[i]))
			System.out.println(a[i]+" is LowerCase later " );
		if(Character.isWhitespace(a[i]))
			System.out.println(a[i]+ " is Whitespace ");
	}
	}
}