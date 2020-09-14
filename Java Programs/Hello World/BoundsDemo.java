// Demonstrate the use of the Dound type
class Stats<T extends Number>{
	T[] nums;
	 
	 Stats(T[] o){
		 nums = o;
		 
	 }
	 double average(){
		 double sum = 0.0;
		 for(int i=0; i<nums.length;i++){
			sum += nums[i].doubleValue();			 
		 }
		 return sum / nums.length;
	 }
}
class BoundsDemo{
	public static void main(String args[]){
		Integer inum[]={1,2,3,4,5};
		Stats<Integer> iob = new Stats<Integer>(inum);
		double v = iob.average();
		System.out.println("iob average is : "+v);
		
		Double dnum[]={1.1,2.2,3.3,4.4,5.5};
		Stats<Double> dob = new Stats<Double>(dnum);
		double w = dob.average();
		System.out.println("dob average si : "+w);
	}
}