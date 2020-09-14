// Demonstrate use of the Enumaration 
enum Name
{
	Sonu, Shaikh, Shahabaj, Sahail,  Salman , Saniya;
}
class EnumName
{
	public static void main(String args[])
	{
		Name obj ;
		obj =Name.Sonu;
		System.out.println("The Value of the obj : "+obj);
		System.out.println();
		
		obj = Name.Shahabaj;
		
		//Compair the To values
		if(obj==Name.Shahabaj)
			System.out.println("obj Containt the same Values");
		else
			System.out.println("Obj NOt Containc The SAme Vvalus");
		
		switch(obj)
		{
			case  Sonu:
			System.out.println("Sonu is a Good Boy");
			break;
			case Shaikh:
			System.out.println("Shaikh is the sir name of sonu");
			break;
			case Shahabaj :
			System.out.println("Shahabaj is the Oringinal Name of sonu");
			 break;
			 
			default  :
			
			System.out.println("Not Match with Enumurations ");
		}
	}
}