// How to take n number of argument in method
class MethodArg {
    public static void main(String[] args){
		System.out.println("Average "+Average(10,10));
	}
	public static int Average(int...numbers){
		int total = 0;
		for(int x:numbers)
			total +=x;
		
		return total/numbers.length;
	}
 }