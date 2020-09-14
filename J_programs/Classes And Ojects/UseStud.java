// program to the Accepts student information and display it
// 1. use command line t receicie total streangth
// use constructor member function wherever required
import java.io.*;
class Student
{
	
	int RollNo;
	String Name;
	static int count=0;
	Student(int Roll, String name)
	{
		RollNo=Roll;
		Name=name;
		count++;
	}
	void display()
	{
		//System.out.println("SR.NO\t Roll Number\tStudent Name");
		System.out.println();
		System.out.print(count+"\t");
		System.out.print("\t"+RollNo+"\t");
		System.out.print("\t"+Name+"\t");
		
	}
	
}
class UseStud
{
	public static void main(String arg[])
	{
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ENTER THE TOTAL NUMBER OF STUDENT : ");
			int Strength=Integer.parseInt(br.readLine());
			System.out.println();
			int roll[]=new int[Strength];
			String Names[]= new String [Strength];
			System.out.println("Enter the Values for the Roll NO And  Names");
			System.out.println();
			for(int i=1;i<Strength;i++)
			{
				System.out.println("Now Enter the Rollno for the Student "+i );
				roll[i]=Integer.parseInt(br.readLine());
				System.out.println("Now Enter the Name for the Student "+i );
				Names[i]=br.readLine();
			}
			Student[] obj=new Student[Strength];
			System.out.println("SR.NO\t Roll Number\tStudent Name");
			for(int i=1;i<Strength;i++)
			{			
			 obj[i]=new Student(roll[i],Names[i]);
			obj[i].display();
			}
		}catch(Exception e){}
	}
}