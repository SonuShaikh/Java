class num5 extends Exception
{
	num5(int n)
	{
		System.out.println(n+ "Is Ellige Exception");
	}
}
 

	
	 class userExp
	 {
		 public static void trial(int l) throws num5
	{
		if(l==5)
		{
			throw new num5(l);
		}
	}
	 public static void counter(int i){
		 try{
			 for(int k=i; k<=10; k++)
			 {
				 System.out.println("NUMBER:"+k);
				 trial(k);
			 }
		 }catch(num5 e){
			 System.out.println("\t Exception cought");
		 }
	 }
	public static void main(String arg[])
	{
		counter(1);
	}
	 }