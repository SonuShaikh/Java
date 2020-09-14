// Using StringTokenizer
import java.util.*;
class STDemo{
	static String instr = " Title = Java the complet reference "+
	                      " is book = use for learnig "+
						  "Java Programming "+
						  "College = Vivekanand College; "+
						  "BCS = 3 ";
	public static void main(String[] args)throws Exception{
		StringTokenizer st = new StringTokenizer(instr,"=;");
		while(st.hasMoreTokens()){
			String k = st.nextToken();
			String v = st.nextToken();
			
			System.out.println(k+"\t"+v);
		}
	}
}
/*
Output:
Title   Java the complet reference  is book
 use for learnig Java Programming College        Vivekanand College; BCS
Exception in thread "main" java.util.NoSuchElementException
        at java.util.StringTokenizer.nextToken(Unknown Source)
        at STDemo.main(STDemo.java:13)
*/