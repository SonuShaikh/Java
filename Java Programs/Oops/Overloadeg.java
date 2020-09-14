// Write a program to OverLoad Constructore
class OverLoad
{
  long number;
  String name;
  
  OverLoad()
  {
	  name = "Sonu";
	  number = 9623;
  }
  OverLoad(String s, long d)
  {
	  name=s;
	  number=d;
  }
  void display()
  {
	  System.out.println("The Name : "+name);
	  System.out.println("The Numbers of : "+number);
  }
}
class Overloadeg
{
	public static void main(String args[])
	{
		OverLoad obj= new OverLoad();
		obj.display();
		OverLoad obj1= new OverLoad("Shaikh", 9975);
		obj1.display();
	}
}