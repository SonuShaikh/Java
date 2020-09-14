//Enhance For Loop
class EnhanceFor{
	public static void main(String[] args){
		int nums[] = {11,22,33,44,55,66,77,88,99};
		System.out.println("Befor Change The Array");
		for(int i = 0;i< nums.length;i++){
			System.out.println(nums[i]);			
		}
		 change(nums);
		System.out.println("After Changing Array");
		for(int i = 0;i< nums.length;i++){
			System.out.println(nums[i]);
		}
		
	}
	public static void change(int x[]){
		for(int i = 0;i< x.length;i++){
			x[i] += 5;
		}
	}
}