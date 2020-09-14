import java.util.*;
import java.io.*;
import java.math.*;
class ComparingLargerNumber{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int resultHolder = 5;
		BigInteger num1 , num2, c;
		List<String> list = new ArrayList<String>();
		try{
            str = br.readLine();			
			 while((str.length() > 0)){
				String[] array = str.split("\\s");
				int len1 = array[0].length();
				int len2 = array[2].length();
				if( len1 >= 1000 || len2 >= 1000 ){
					System.exit(0);
				}
				    num1 = new BigInteger(array[0]);
					//int num1 = Integer.parseInt(array[0]);
					String operator = array[1];
					//int num2 = Integer.parseInt(array[2]);
		            num2 = new BigInteger(array[2]);
				
			    if(num1.signum() < 0 || num2.signum() < 0){
					System.exit(0);
				}
				
				
				 switch(operator){
				case "==":
				        if(num1.equals(num2))							
							list.add(""+1);
						else
							list.add(""+0);		
				   break;
				case ">=":
				       c = num1.max(num2);
					   if(c.equals(num1))
						   list.add(""+1);
                       else
                           list.add(""+0);							
				   break;
				case "<=":
				        c = num1.min(num2);
					   if(c.equals(num1))
						   list.add(""+1);
                       else
                           list.add(""+0);
				   break;
				case "!=":
				       if(num1.equals(num2) == false)							
							list.add(""+1);
						else
							list.add(""+0);
				   break; 
				default :
				   System.exit(0);
			}	
              			
			 	str = br.readLine();
				
			}
			for(String x: list)
				System.out.println(x);
		}catch(Exception e){System.out.println(e);}
	}
}