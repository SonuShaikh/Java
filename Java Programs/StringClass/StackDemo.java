// demonstrat use of the Stack
import java.util.*;
class StackDemo
{
	static void printStack(Stack<String> s)
	{
		if(s.isEmpty())
		{
			System.out.println("You've NOthing in Stackj");
		}
		else
		{
			System.out.printf("%s Top \n",s);
		}
	}
	public static void main(String args[])
	{
		Stack<String> stack = new Stack<String>();
		
		stack.push("Hello");
		printStack(stack);
		
		stack.push("Sonu");
		printStack(stack);
		
		stack.push("Good Evening");
		printStack(stack);
		
		stack.pop();
		printStack(stack);
		
		stack.pop();
		printStack(stack);
		
		stack.pop();
		printStack(stack);
	}
}