abstract class players
{
   abstract void display();
} 

abstract class betsman extends players{}
abstract class bowler extends players{}

class abdev extends betsman{
	void display()
	{
		System.out.println("Ab develars");
	}
}
class rahul extends betsman{
	void display()
	{
		System.out.println("Rahul Dravid");
	}
	
}
class zaheer extends bowler{
	void display()
	{
		System.out.println("Zaheer Khan");
	}
}

class Abstracteg
{   
     public static final int num=3;
	 
	public static void main(String arg[])
	{
		players p[]=new players[num];
		p[0]=new abdev();
		p[1]=new rahul();
		p[2]=new zaheer();
		for(int i=0;i<num; i++)
		{
			players play=p[i];
			if(play instanceof bowler)
			{
				play.display();
			}
		}
	}
}