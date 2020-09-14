// Demonstrat use of the toUpperCase Nad toLowerCase class
class Case
{
	public static void main(String args[])
	{
		String s1 = "This Is The Demo Of CAse Sencetive";
		
		System.out.println("Original State : "+s1);
		
		String s2, s3;
		
		s2 = s1.toUpperCase();
		s3 = s1.toLowerCase();
		
		System.out.println();
		System.out.println("To UpperCase : "+s2);
		System.out.println();
		System.out.println("To LowerCase : "+s3);
	}
}