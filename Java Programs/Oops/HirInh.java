//Program to performe addition of two numbers using Hierarchycal inheritace
class Vehicle
{
	String vName;
	String vFuel;
	double vPrice;
	double vMialege;
	int Wheels;
	
	void getData( String CN, String CF, double P, double M, int W)
	{
		 vName = CN;
		 vFuel = CF;
		 vPrice = P;
		 vMialege = M;
		 Wheels = W;
		 
	}
}
class Ktm360 extends Vehicle
{
	void display()
	{
		System.out.println("The Vehicle Name : "+vName);
		System.out.println("The Vehicle Fuel : "+vFuel);
		System.out.println("The Vehicle Price : "+vPrice);
		System.out.println("The Vehicle Mialage : " +vMialege + " KMPL");
		System.out.println("The Vehicle Wheels : "+Wheels);
	}
}
class MercedezeBenz extends Vehicle
{
	void show()
	{
		
		System.out.println("The Vehicle Name : "+vName);
		System.out.println("The Vehicle Fuel : "+vFuel);
		System.out.println("The Vehicle Price : "+vPrice);
		System.out.println("The Vehicle Mialage : "+vMialege + " KMPL");
		System.out.println("The Vehicle Wheels : "+Wheels);
	
	}
}
class BMW extends Vehicle
{
	void Print()
	
	{
		System.out.println("The Vehicle Name : "+vName);
		System.out.println("The Vehicle Fuel : "+vFuel);
		System.out.println("The Vehicle Price : "+vPrice);
		System.out.println("The Vehicle Mialage : "+vMialege + " KMPL");
		System.out.println("The Vehicle Wheels : "+Wheels);
	}
}
class MainVehicle
{
	public static void main(String args[])
	{
		System.out.println(" \n\n KTM Product \n\n");
		Ktm360 k= new Ktm360();
		k.getData("Sport Bike", " Petrole", 300000,35.75,2);
		k.display();
		System.out.println(" \n\nMercedeze Benzs Product \n\n");
		MercedezeBenz mb= new MercedezeBenz();
		mb.getData("SUV", " Petrol / Desel", 15000000,20.00,4);
		mb.show();
		System.out.println(" \n\n BMW's Product n\n");
		BMW S= new BMW();
		S.getData("7 Series", " petrol", 67000000,70,4);
		S.Print();
	}
}