// Genirick  Methodes
class GeniricMethod
{
	private static <T> void PrintMe(T[] a)
	{
		for(T s : a)
		{
			System.out.printf("%s ", s);
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Integer iray[]={1,2,3,4,5,6,7,8,9,0};
		Character cray[]={'S', 'O', 'N', 'U'};
		
		PrintMe(iray);
		PrintMe(cray);
	}
	
	/* private static void PrintMe(Integer[] i)
	{
		for(Integer x : i)
		{
			System.out.printf("%s ", x);
		}
		System.out.println();
	}
	private static void PrintMe(Character[] ch)
	{
		for(Character y : ch)
		{
			System.out.printf("%s ",y);
		}
	} */
}