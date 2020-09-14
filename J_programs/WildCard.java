class stats<T extends Number>
{
	 T[] nums;
	 stats (T[] o)
	 {
		 nums=o;
	 }
	 double average()
	 {
		 double sum=0.0;
		 
		 for(int i=0; i<nums.length; i++)
		 {
			 sum+=nums[i].doubleValue();
		 }
		 return sum/nums.length;
	 }
	 boolean sameAvg(stats <?> ob)
	 {
		 if(average() == ob.average())
			 return true;
		 else 
			 return false;
	 }
}

class WildCard
{
 public static void main(String arg[])
 {
	 Integer inums[]={1,2,3,4,5};
	 stats <Integer> iob= new stats <Integer> (inums);
	 double x = iob.average(inums);
	 System.out.println("The Averate of the iob : "+x);
	 
	 Double dnums[]={1.1,2.2,3.3,4.4,5.5};
	 stats <Double> dob= new stats<Double>(dnums);
	 double y= dob.average(dnums);
	 System.out.println("The Averate of the dob : "+y);
	 
	 Float fnums[]={1.0F,2.0F,3.0F,4.0F,5.0F};
	 stats <Float> fob= new stats <Float>(fnums);
	 double z= fob.average(fnums);
	 System.out.println("The Averate of the fob : "+z);
	 
	 
	 System.out.println("The Average of iob and dob are  : ");
	 
	 
	  if(iob.sameAvg(dob))
	  {
		  System.out.println("They are Same ");
	  }
	  else 
	  {
		  System.out.println("They are Different");
	  }
	 
	 if(iob.sameAvg(fob))
	 
		 System.out.println("They Are SAme");
		 
	 else
		 System.out.println("They are different");
 }
}