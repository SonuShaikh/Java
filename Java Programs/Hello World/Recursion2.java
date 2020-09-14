// another example of array
class RectTest{
	 int array[];
	 RectTest(int i)
	 {
		array = new int[i];
	 }
	 // recursive method
	 
	 void printArray(int i)
	 {
		 if(i==0)
			 return ;
		 else
			 printArray(i-1);
		 System.out.println("["+(i-1)+"] ="+array[i-1]);
	 }
}

class Recursion2{
	public static void main(String args[])
	{
		RectTest TR = new RectTest(10);
		int i;
		for(i = 0; i<10; i++)
			TR.array[i]=i;
		 TR.printArray(i);
	}
	
}