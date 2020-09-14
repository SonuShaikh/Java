public class book extends student1
{
	int NO;
	String BookName;
	public void getdata(int bn, String b)
	{
		NO=bn;
		BookName=b;
	    display();
	}
	public void display()
	{
		System.out.println("Booke issue Number" +NO);
		System.out.println("Booke issue NAME" +BookName);
	}
}
