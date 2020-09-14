import java.util.*;
class TwinArray{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n <= 2 || n >=1000000)
			System.exit(0);
		int[] array1 = new int[n];
		int[] array2 = new int[n];
		
		for(int i = 0; i < n; i++){
			array1[i] = scan.nextInt();
		}
		for(int i = 0; i < n; i++){
			array2[i] = scan.nextInt();
		}
		int small = array1[0] + array2[0];
		int sum;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n ; j++){
				sum = array1[i] + array2[j];
				if(small > sum)
					small = sum;
			}
		}
		
		System.out.println(small);
	}
}