// Demonstrate use of the Stats
class Stats < T extends Number >
{
	T[] nums;
	
	Stats(T[] o)
	{
		nums = o;
	}
	
	double Average()
	{
		double sum = 0.0;
		for(int i = 0; i<nums.length; i++)
		{
			sum = sum + nums[i].doubleValue();
		}
		return sum/ nums.length;
	}
	boolean sameAvg(Stats <?> ob)
	{
		if(Average()== ob.Average())
			return true;
		else
			return false;
		
	}
}
class StatsDemo
{
	public static void main(String args[])
	{
		Integer inums[] = {1,2,3,4,5};
		Stats<Integer> iob = new Stats<Integer> (inums);
		double v=iob.Average();
		System.out.println("The Average is : "+v);
		
		Double dnums[]={1.0,2.0,3.0,4.0,5.0};
		Stats <Double> dob = new Stats<Double>(dnums);
		double w = dob.Average();
		System.out.println("The Average is : "+w);
		Float fnums[]= {1.0F,5.0F,4.0F,2.0F,3.0F};
		Stats<Float> fob = new Stats<Float>(fnums);
		double x = fob.Average();
		System.out.println("The Average is : "+x);
		
		if(iob.sameAvg(dob))
			System.out.println("The Average is  Same");
		else
			System.out.println("The Avaragei is Not the Same");
		
		if(dob.sameAvg(fob))
			System.out.println("The Average is Same");
		else
			System.out.println("The Avarage is NOt Same");
		
	}
}