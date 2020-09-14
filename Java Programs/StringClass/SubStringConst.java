// Ascci Values f
class SubStringConst
{
	public static void main(String agr[])
	{
		char asci[] = {65,66,67,68,69,70};
		String s1 = new String(asci);
		System.out.println(s1);
		
		String s2 = new String(asci,2,4);
		System.out.println(s2);
	}
}