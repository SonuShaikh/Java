/* Write a program to accept student information amd display it 
 - Uset the command line to Recive the total price
 - Use Constructor Member whenever is Necessary
*/
import java.util.Scanner;
class Studentinfos
{
	String Stud_Name;
	int rollno;
	int Total_Streinght;
	
	Studentinfos(String s, int r )
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Total Staing of the Student in the class :");
		Total_Streinght= scan.nextInt();
		Stud_Name = s;
		rollno= r;
	}
	void show()
	{
		System.out.println("The Total straing of the Class is : "+Total_Streinght);
		System.out.println("The Name of the Student is : "+Stud_Name);
		System.out.println("The Roll Number of the Student is : "+rollno);
	}
}
class StudentInformation
{
	public static void main(String args[])
	{
		Studentinfos obj = new Studentinfos("Sonu", 74);
		obj.show();
	}
	
}