import java.io.*;
import java.util.*;
class CompLarge{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String[] result,a;
        StringTokenizer st;		
		StringBuffer presenttoken;
		int nooftoken,lenpresenttoken,count = 0;
		char ch;
		StringBuffer sb;
		void getInput(){
			try{str = br.readLine();}catch(Exception e){};
			str = str.replace("\n","");
			convertToTokens();
			display();
		}
		
		
		void convertToTokens(){
		st = new StringTokenizer(str);
		nooftoken = st.countTokens();
		a = new String[nooftoken];
		result = new String[nooftoken];
		for(int i = 0; i < nooftoken; i++){
			a[i] = st.nextToken().toString();
		}
	 }
	 
	 void removeNewline(){
        
    }
	 
	 void display(){
		 for(int i=0;i<a.length;i++){
			 System.out.printf("%s ",a[i]);
		 }
	 }
	 
}
class CompLargeNo{
	public static void main(String[] args){
		CompLarge obj = new CompLarge();
		obj.getInput();
	}
}