// Queueeg
import java.util.*;
class Queueeg1
{
	public static void main(String args[])
	{
		PriorityQueue<Integer> Q = new PriorityQueue<Integer>();
		
		Q.offer(1);
		Q.offer(2);
		Q.offer(3);
		Q.offer(4);
		
		System.out.printf("%s ",Q);
		
		System.out.println();
		
		
		System.out.println(Q.peek());
		
		Q.poll();
		System.out.println(Q);
		
		
	}
}
