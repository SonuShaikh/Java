import java.util.*;
import java.io.*;
class LargerNumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		//String[] result = new String[];
		int count = 0;
		String resultHolder = "";		 
		List<String> list = new LinkedList<String>();
		try{
			  
				while((str = br.readLine()) != null){
			String[] arr;
			arr = str.split("\\s");		
			 
				int num1 = Integer.parseInt(arr[0]);
				String operator = arr[1];
				int num2 = Integer.parseInt(arr[2]);
				
				//System.out.println(num1.toString().length);
				int noOfDigit1 = 1;
				int noOfDigit2 = 1;
                while((num1 = num1/10) != 0) ++noOfDigit1;
								
				while((num2 = num2/10) != 0) ++noOfDigit2;
				
				 if(num1 < 0 || num2 < 0 || noOfDigit1 > 1000 || noOfDigit2 > 1000 ){
					System.exit(0);
				}
			switch(operator){
				case "==":
				   //System.out.println(((num1 == num2) ? 1 : 0));
				   list.add(""+((num1 == num2) ? 1 : 0));
				   resultHolder = resultHolder+((num1 == num2) ? 1 : 0);
				   //result[count] = resultHolder;
				   
				   break;
				case ">=":
				   //System.out.println(((num1 >= num2) ? 1 : 0));
				   list.add(""+((num1 >=  num2) ? 1 : 0));
				   resultHolder = resultHolder+((num1 >= num2) ? 1 : 0);
				   //result[count] = resultHolder;
				   //count++;
				   break;
				case "<=":
				   //System.out.println(((num1 <= num2) ? 1 : 0));
				   list.add(""+((num1 <=  num2) ? 1 : 0));
				   resultHolder = resultHolder+((num1 <= num2) ? 1 : 0);
				   //result[count] = resultHolder;
				   //count++;
				   break;
				case "!=":
				   //System.out.println(((num1 != num2) ? 1 : 0));
				   list.add(""+((num1 !=  num2) ? 1 : 0));
				   resultHolder = resultHolder+((num1 != num2) ? 1 : 0);
				   //result[count] = resultHolder;
				   //count++;
				   break; 
				default :
				   System.exit(0);
			} 
			//count++;
		}
		    //System.out.println(strdata);
			}catch(Exception e){System.out.println(e);}
		 	 // list.remove("\\n");
			 for(String x : list)
				System.out.printf("%s \n",x);
			
			//System.out.println(resultHolder);
	}
}