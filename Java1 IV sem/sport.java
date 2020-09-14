public class sport extends student1
{
	int p_no;
	String Name;
    public void getdata(int bn,String b)
	{
		p_no=bn;
		Name=b;
		display();
	}
   public void display()
	{
		System.out.println("Player Number"+p_no);
		System.out.println("Player Game"+Name);
	}
}
