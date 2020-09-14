import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumMM {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
	
		int max = arr[0], min = arr[0],sum = 0;
		for(int i = 1; i < 5 ; i++){
			if(arr[i] > max)
				max = arr[i];
			if(arr[i] < min)
				min = arr[i];
		}
		
		for(int i=0; i<5;i++){
			sum = sum + arr[i];
		}
		
		int maximum_sum = sum - min;
		int manimum_sum = sum - max;
		
		System.out.println(manimum_sum+" "+maximum_sum);
		
    }
}

