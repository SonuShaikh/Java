public class studnt
{
	private int rollno;
	private String name;
	public void getdata(int rn, String nm)
	{
		rollno=rn;
		name=nm;
	}
	 public void putdata()
	 {
		 System.out.println("Student RollNo is:"+rollno);
		 System.out.println("Student Name is:"+name);
	 }	 
}