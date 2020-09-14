import java.util.*;
import java.io.*;
class A{
	 public static void main(String[] args)throws IOException{
		 Scanner scan = new Scanner(System.in);
		 String str = scan.nextLine();
		 System.out.println(new StringBuffer(str));
		 /* StringTokenizer st = new StringTokenizer(str);
		 int nooftokens = st.countTokens();
		 System.out.println(nooftokens);
		 while(st.hasMoreTokens()){
			 System.out.println(st.nextToken());
		 } */
		 /* String[] arr1 = {"Hello","World","Sonu","Shaikh","Khan","Hello","World","Sonu","Shaikh","Khan"};
		 //String[] arr2 = {"Hello","World","Sonu","Shaikh","Khan"};
		 while(String str = arr1.hasNext()){
			 for(int i = 0; i< arr1.length; i++){
				if(str.equals(arr1[i]))
					System.out.println
			 }
		 } */
		   /* for(int i = 0; i< arr1.length; i++){
			   for(int j = 0; j< arr1.length; j++){
				   if((arr1[i].equals(arr1[j]))){
					   System.out.printf("%s ",arr1[i]);
				   }
			   }
		   } */
	    /* Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		String[] arra = {""};
		int count = 0;
		while((str = br.readLine()) != null){
			arra[count] = str;
		}
		for(String x:arra)
			System.out.printf("%s ",x); */
		/* List<String> li = new LinkedList<String>();
		li.add("Hello");
		li.add("Hello");
		li.add("Hello");
		String[] arr = li.toArray(new String[li.size()]);
		System.out.println(li);
		for(String x: arr)
			System.out.printf("%s ",x); */
		
		/* List<String> list = new LinkedList<String>();
        list.add("hello");		
        list.add("Hello");		
        list.add("Hello");
         // for(int i = 0; i < list.size(); i++){
			  char[] s1array = list.get(0).toCharArray();
			  char[] s2array = list.get(1).toCharArray();
		 // }		
		 
		 for(char x : s1array)
		 System.out.printf("%c ",x); */
	 /* List<String> list = new LinkedList<String>();
	 String str = "Hello World My Name is shaikh shahabaj";
	 String[] ar;
	 ar = str.split("\\s");
	 
	 for(String x : ar)
		 list.add(x);
	 System.out.print(list.get(0).length());
 } */
}
}	