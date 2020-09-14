// Find out the average is same or not make sure use of the wild card Arguments
class Stats1<T extends Number>{
	T[] nums;
	Stats1(T[] o){
		nums = o;
	}
	
	double average(){
		double sum = 0.0;
		for(int i = 0; i<nums.length; i++){
			sum += nums[i].doubleValue();
		}
		return sum/nums.length;
	}
	// determine the average is same or not
	
	boolean sameAvg(Stats1 <?> ob){
		if(average() == ob.average())
			return true;
		else
			return false;
		
	}
}

class WildCardDemo{
	public static void main(String args[]){
		Integer inum[]={1,2,3,4,5};
		Stats1<Integer> iob = new Stats1<Integer>(inum);
		double v = iob.average();
		System.out.println("iob average is : "+v);
		
		
		Double dnum[]={1.1,2.2,3.3,4.4,5.5};
		Stats1<Double> dob = new Stats1<Double>(dnum);
		double w = dob.average();
		System.out.println("dob average is : "+w);
		
		Float fnum[]={1.0F,2.0F,3.0F,4.0F,5.0F};
		Stats1<Float> fob = new Stats1<Float>(fnum);
		double x = fob.average();
		System.out.println("dob average is : "+x);
		
		
		
		// determine average is smae or not
		System.out.print("The average of iob and dob ");
		if(iob.sameAvg(dob))
			System.out.println(" Is same");
		else
			System.out.println(" Is Different");
		
		System.out.print("The average of iob and fob");
		if(iob.sameAvg(fob))
			System.out.println(" Is same");
		else
			System.out.println(" Is different");
			
	}
}