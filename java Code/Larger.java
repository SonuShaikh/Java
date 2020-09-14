// Find Largest Number Amount n numbers

import java.io.*;
class Larger{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Count of Total number");
		int num = Integer.parseInt(br.readLine());
		int a[] = new int[num];
		int max;
		System.out.println("Enter Any "+num+" Numbers");
		for(int i = 0;i<a.length;i++){
			a[i] = Integer.parseInt(br.readLine());
			if(a[i] > a[i+1]){
				 max = a[i];
			}
		}
		/* for(int i = 0;i<a.length;i++){
			
		} */
		System.out.println("Largest Number is "+max);
		 /* System.out.println("ENter Any number");
		 int n1 = Integer.parseInt(br.readLine());
		 
		 System.out.println("ENter Any number");
		 int n2 = Integer.parseInt(br.readLine());
		 
		 System.out.println("ENter Any number");
		 int n3 = Integer.parseInt(br.readLine());
		 int max;
		 if(n1>n2){
			 max = n1;
		 }else {
			 max = n2;
		 }
		 if(n3 > max){
			 max = n3;
		 }
		 System.out.println("Maximun number is "+max); */
		
		
	}
}