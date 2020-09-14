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

class Result extends studnt
{
	int t1,t2;
	public void getest(int n, int m)
	 {
		 t1=n;
		 t2=m;
	 }
	 public void  result()
	 {
		 int reslt=t1+t2;
		 System.out.println("Total Marks ="+reslt);
	 }
}

class singleinh
{
	public static void main(String arg[])
	{
		studnt obj=new studnt();
		obj.getdata(1,"sonu");
		obj.putdata();
		Result obj1=new Result();
		obj1.getest(70,80);
		obj1.result();
	}
}
/*C:\Users\sonu\Documents\Java>javac Result.java

C:\Users\sonu\Documents\Java>java singleinh
Student RollNo is:1
Student Name is:sonu
Total Marks =150*/ 