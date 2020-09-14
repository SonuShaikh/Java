//  write program to demonstrate the multilevel Inheristence
class Sonu
{
	 String Name;
	 String Status;
	
	void getData(String N, String S)
	{
		Name = N;
		Status = S;
		
		
	}
	
}
class Sonu1S extends Sonu
{
	
	 String SchoolName;
	 String CollegeName;
	
	 void takeData(String sc, String cn)
	 {
		 SchoolName = sc;
		 CollegeName = cn;
		
	 }
	
	
}
class Sonu2 extends Sonu1S
{
	void display()
	{
		System.out.println("Name : "+Name);
		System.out.println("Status : "+Status);
		 System.out.println("School Name : "+SchoolName);
		 System.out.println("College Name : "+CollegeName);
	}
}
class SonuMain
{
	public static void main(String args[])
	{
		Sonu2 obj=new Sonu2();
		obj.getData("Shaikh Shahabaj Mubarak", " Single But Reddy to Mingle");
		obj.takeData("Salman Khan INstutud of Mumbai"," Vivekand College Aurangabad");
		obj.display();
		
	}
}