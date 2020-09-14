class twoW extends vehicle
{
   int wheeles;
   public void display()
   {
	   wheeles=2;
	   System.out.println("Car color" +color);
	   System.out.println("Car Type" +fuel);
	   System.out.println("Number of Wheels" +wheeles);
   }
}
class fourW extends vehicle
{
	
	int wheels;
	public void show()
	{
		int wheels=4;
		System.out.println("Car color:"+color);
		System.out.println("Car Type" +fuel);
		System.out.println("Number of wheels" +wheels);
	}
}
public class vehicle
{
	String color;
	String fuel;
	public void getdata()
	{
		color="Black";
		fuel="Petrol";
	}
}