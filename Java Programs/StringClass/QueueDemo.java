// demonstrate use of the Queue
import java.util.*;
class QueueDemo
{
	public static void main(String args[])
	{
		PriorityQueue <String> q = new PriorityQueue<String>();
		
		q.offer("Sonu");
		q.offer("Monu");
		q.offer("Shaikh");
		
		System.out.printf("Queue Elements is : %s \n", q);
		
		q.poll();
		System.out.printf("Queue Elements is : %s \n",q);
		
		q.addFirst("Sonu");
		System.out.printf("Queue Elements is : %s \n",q);
	}
}