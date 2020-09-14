public class student1
{
	int rollno;
	String Name;
	public void get(int r, String s)
	{
       rollno=r;
	   Name=s;
	   disply();
	}
	public void disply()
	{
		System.out.println("WELCOME TO THE STUDENT INFORMATION");
		System.out.println("The name of the Student:" +Name);
		System.out.println("The Roll NO of the Student:" +rollno);
	}
}