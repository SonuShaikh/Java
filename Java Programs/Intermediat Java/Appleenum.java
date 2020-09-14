// use of the the Values() and valuesOf() methodes int Enum
enum
Apple
{
    Iphone, Ipod, Imac, Itune, Ipad,
}
class Appleenum
{
	public static void main(String args[])
	{
		
		System.out.println("Here is the Conteain of the Apple Enum");
		// Use of teh Values() method
		Apple Aray[] = Apple.values();
		for(Apple X : Aray)
		{
			System.out.println(X);
		}
		
		System.out.println();
		
		// Use of the ValuesOf() method
		Apple ap;
		ap = Apple.valueOf("Iphone");
		
		System.out.println("The Values of the ap : "+ap);
	}
}