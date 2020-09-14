// Example of Enumaration
import java.util.*; 
enum Answer
{
		NO, YES,MAYBE,LATTER, SOON ,NOTHING, NEVER;
}
class Quetion
{
	Random Rand = new Random();
	Answer ask()
	{
		int prob = (int) (100*Rand.nextDouble());
		if(prob< 15)
			return Answer.NO;
		else if(prob<30)
			return Answer.YES;
		else if(prob < 45)
			return Answer.MAYBE;
		else if(prob<60)
			return Answer.LATTER;
		else if(prob < 75)
			return Answer.SOON;
		else if(prob < 98)
			return Answer.NOTHING;
		else 
			return Answer.NEVER;
			
	}
}
class AskMe
{
	public static void answer(Answer result )
	{
		switch(result)
		{
			case NO :
			System.out.println("NO");
			break;
			case YES:
			System.out.println("YES");
			break;
			case MAYBE :
			System.out.println("MAYBE");
			break;
			case LATTER :
			System.out.println("LATTER");
			break;
			case SOON :
			System.out.println("SOON");
			break;
			case NOTHING : 
			System.out.println("NOTHING");
			break;
			
			default : 
			System.out.println("NEVER");
		}
	}
	public static void main(String args[])
	{
		
		Quetion q = new Quetion();
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		
		
	}
}