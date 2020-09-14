abstract class player1
{
  abstract void display();
}
abstract class batsmen extends player1{}
abstract class bowler extends player1{}


class Dhoni extends batsmen {
	void display()
	{
		System.out.println("dhoni");
	}
}
class Sachin extends batsmen {
	void display()
	{
		System.out.println("Sachin");
	}
}
class Zaher extends bowler {
	void display()
	{
		System.out.println("ZAHEER");
	}
}
class player{
	public static final int num=3;
	public static void main(String args[]){
		player1 p[]=new player1[num];
		p[0]=new Dhoni();
		p[1]=new Sachin();
		p[2]=new Zaher();
		
		for(int i=0;i<num ; i++)
		{
			player1 p1=p[i];
			if(p1 instanceof batsmen)
			{
				p1.display();
			}
		}
	}
}