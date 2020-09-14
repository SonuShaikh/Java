import java.util.*;
class LinkedListEx{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		List<String> list1 = new LinkedList<String>();
		int number = scan.nextInt();
		int position = scan.nextInt();
		String str1 = "NULL";
		String str;
	    boolean flag = true;
		while(flag){				
				 str = scan.next();
				 if(str1.equals(str)){}else{
					 int c = Integer.parseInt(str);
				     if(c < 0){ System.exit(0);}}
				 
					if(str1.equals(str)){
						flag = false;
						list1.add(str);
				   }else{				
						list1.add(str);
				   }				
		} 
		
		list1.add(position,""+number);
		printMe(list1); 

	}
	public static void printMe(List<String> li){
		for(String x : li)
			System.out.printf("%s ",x);
	}
}