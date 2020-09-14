import java.util.*;
class BondingElements{	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	    /* List<Integer> li = new LinkedList<Integer>(); */
		
		int[] num;
		String[] strarray;
		
		String str;		
		str = scan.nextLine();
		
		strarray = str.split("\\s+");
		
		for(int i = 0; i < num.length; i++){
			num[i] = scan.nextInt();
		}
		
		for(int i = 0; i < (num.length - 2); i++){
			int n1 = num[i];
			int sum = num[i+1];
			int n2 = num[i+2];
			if((n1+n2) == sum){
				
				li.add(sum);
			}
		}
		 Collections.sort(li);
		 for(Integer x : li )
			 System.out.printf("%s ",x);
	}
}

// -999999 to +999999

import java.util.Scanner;

public class ArrayModify {

    public static void main(String[] args) {
        int[] list;
        String st;
        String[] stNew;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Numbers: "); // If user enters 5 6 7 8 9 
        st = scan.nextLine();
        stNew = st.split("\\s+");
        list = new int[stNew.length]; // Sets array size to 5

        for (int i = 0; i < stNew.length; i++){
            list[i] =  Integer.parseInt(stNew[i]);
            System.out.println("You Enterred: " + list[i]);
        }
    }
}