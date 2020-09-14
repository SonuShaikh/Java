import java.io.*;
class ReverseDemo { 
         public static void main(String args[])throws IOException { 
		  
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
								    
           StringBuffer s = new StringBuffer(args[0]);
           System.out.println(s); 
		   StringBuffer ns = s.reverse(); 
	     	   System.out.println(ns);
		  if(s == ns){
			  System.out.println("Number is Magic");
		  }else{
			  System.out.println("Number is Not Magic");
		  }
}
}