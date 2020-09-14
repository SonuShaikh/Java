//Sum of first 20 numbers
class Sum20{
	public static void main(String[] args){
		int sum = 0;
		for(int i=1;i<=20;i++){
			System.out.println(sum+" + "+i+" = "+(sum = sum + i));
		}
		System.out.println("Sum of first 20 is "+sum);
	}
}