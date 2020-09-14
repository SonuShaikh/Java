// String to Integers
import java.util.*;
class BondingElement{
	public static void main(String[] args){
		//List<Integer> li = new LinkedList<Integer>();
		int nums[];
		String str;
		String[] strarray;
		int min = -9999999;
		int max = 9999999;
		Scanner scan = new Scanner(System.in);
		
		str = scan.nextLine();
		strarray = str.split("\\s");
		nums = new int[strarray.length];
		int[] result = new int[strarray.length];
		int count = 0;
		
		for(int i = 0; i < strarray.length; i++){
			nums[i] = Integer.parseInt(strarray[i]);
			if(nums[i] <= max && nums[i] >= min){
				continue;
				}else{
					System.exit(0);
				}	
		}
		
		
		for(int i =0; i < (nums.length - 2) ; i++){
			int n1 = nums[i];
			int sum = nums[i+1];
			int n2 = nums[i+2];
			if((n1+n2) == sum){				
				result[count] = sum;
				count++;
			}
		}
		 Arrays.sort(result);
		 
		/* Collections.sort(li);*/
		 for(int x : result )
			 if(x == 0)
                  continue;
             else
                System.out.println(x);				 
	}
}