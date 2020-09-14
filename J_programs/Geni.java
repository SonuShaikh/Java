class Sonu<S extends Number>
{
	S son[];
	
	Sonu(S[] nums)
	{
		son= nums;
	}
	 public double Average()
	{
		double sum =0.0;
		for(int s=0; s<son.length; s++)
		{
			sum=sum+ son[s].doubleValue();
		}
		return sum/son.length;
	}
	
	boolean sameAvg(Sonu <?> so)
	{
		if(Average()==so.Average())
			return true;
		else 
			return false;
	}
}
class Geni
{
	public static void main(String args[])
	{
		Integer inums[]={10,20,30,40,50,60,70,80,90};
		Sonu <Integer> iobj = new Sonu<Integer>(inums);
		double a= iobj.Average(inums);
		System.out.println("The Average of the iobj : "+a);
		
		Float fnums[]={10F,20F,30F,40F,50F,60F,70F,80F,90F};
		Sonu<Float> fobj= new Sonu <Float> (fnums);
		double b= fobj.Average(fnums);
		System.out.println("The Average of the fobj  "+b);
		
	    Double dnums[]={10.00,20.00,30.00,40.00,50.00,60.00,70.00,80.00,90.00};
		Sonu <Double> dobj =new Sonu <Double> (dnums); 
		double c= dobj.Average(dnums);
		System.out.println("The Averag of the dobj is : "+c);
		
		System.out.println("The Relation ship between iobj & fobj & dobj");
		
		
		if(iobj.sameAvg(fobj))
			System.out.println("They are the Same");
		else 
			System.out.println("They are the Diffirent");
		
		if(iobj.sameAvg(dobj))
			System.out.println("They are the same");
		else 
			System.out.println("They area the Diffirent");
	
	}
}