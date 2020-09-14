// Getting User Information useing class and object
import java.io.*;
import java.util.*;
class Student{
	String name,add;
	int rollno,phoneno;
	
	void getInput(String n,String a,int r, int p){
		name = n;
		add = a;
		rollno = r;
		phoneno = p;
	}
	
	void show_data(){
		System.out.println("Your Name is "+name);
		System.out.println("Your Address is "+add);
		System.out.println("Your RollNo is "+rollno);
		System.out.println("Your PHone no is "+phoneno);
          
		}
	
}
class StudInfo{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String n = s.next();
		System.out.println("Enter Your Addres");
		String a = s.next();
		System.out.println("Enter YOour Rollno");
		int r = s.nextInt();
		System.out.println("Enter Your phone No");
		int p = s.nextInt();
		
		Student sonu = new Student();
		sonu.getInput(n,a,r,p);
		sonu.show_data();
	}
}