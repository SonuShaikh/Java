// Write a program to demonstrat use of the reverse() methode;
class ReversDemo
{
	public static void main(String args[])
	{
		StringBuffer str = new StringBuffer("ABCDEFGIK");
		System.out.println("Original String : "+str);
		str.reverse();
		System.out.println("After The Revers : "+str);
	}
}