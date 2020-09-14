// Introduction to the Stack
import java.util.*;
class StackExample
{
	private static void PrintStack(Stack <String> s)
	{
		if(s.isEmpty())
			System.out.println("You Hava Nothing in the Stack");
		else 
			System.out.printf("%s TOP \n", s);
	}
	public static void main(String args[])
	{
		Stack <String>sonu = new Stack<String>();
		sonu.push("Bottom");
		PrintStack(sonu);
		
		sonu.push("Second");
		PrintStack(sonu);
		
		sonu.push("Third");
		PrintStack(sonu);
		
		sonu.pop();
		PrintStack(sonu);
		
		sonu.pop();
		PrintStack(sonu);
		
		sonu.pop();
		PrintStack(sonu);
	}
}