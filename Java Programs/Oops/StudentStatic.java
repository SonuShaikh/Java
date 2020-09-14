// Write a program to to use the static keyword
class Student
{
   String Name;
   String Lname;
   static int rollNo=0;
   
   void getData(String n, String ln)
   {
	   Name= n;
	   Lname = ln;
	   rollNo++;
   }
   void display()
   {
	   System.out.println(" Name : "+Name);
	   System.out.println(" Last Name : "+Lname);
	   System.out.println(" Roll No : " +rollNo);
   }
}
class StudentStatic
{
	public static void main(String args[])
	{
		Student obj = new Student();
		obj.getData("Sonu", "Shaikh");
		obj.display();
		Student obj1 = new Student();
		obj1.getData("Sonu", "Shaikh");
		obj1.display();
		Student obj2 = new Student();
		obj2.getData("Sonu", "Shaikh");
		obj2.display();
		Student obj3 = new Student();
		obj3.getData("Sonu", "Shaikh");
		obj3.display();
		Student obj4 = new Student();
		obj4.getData("Sonu", "Shaikh");
		obj4.display();
		
	}
}