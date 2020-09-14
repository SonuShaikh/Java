// Methods Instance Variable and Constuctor of the Enumarationns
enum Players
{
	Sonu(1),Anita(2),Sahil(3),Shah(4),Salman_Khan(5), Gayle(6), SRK(7);
	
	// instance variable
	private int num;
	
	// constrctor
	
	Players(int p)
	{
		num = p;
	}
	
	int getNum()
	{
		return num;
	}
}
class Playersenum
{
	public static void main(String args[])
	{
		Players bats;
		// diplay the Gayles NO
		System.out.println("Gayle : "+Players.Gayle.getNum());
		
		System.out.println("Displya all Players with is numbers");
		
		for(Players x : Players.values())
		{
			System.out.println(x+"\t"+x.getNum());
		}
	}
}