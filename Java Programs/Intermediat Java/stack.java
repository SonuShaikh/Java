// Stack ema
import java.util.*;
class stack

{
	private static void ShowStack(Stack<Integer> s)
	{
		if(s.isEmpty())
		System.out.println("YOu hava No Elemetn in The Stack");
		else
			System.out.printf("%s Top\n",s);
	}
	public static void main(String args[])
	{
		Stack<Integer> intstack = new Stack<Integer>();
		intstack.push(1);
		ShowStack(intstack);
		
		intstack.push(2);
		ShowStack(intstack);
		
		
		intstack.push(3);
		ShowStack(intstack);
		
		intstack.pop();
		ShowStack(intstack);
		intstack.pop();
		ShowStack(intstack);
		intstack.pop();
		ShowStack(intstack);
		
	}
}