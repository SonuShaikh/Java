//Tcs Ignite Coding Challenge
import java.io.*;
class CoddingChallenge{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			
			int pl_wt = Integer.parseInt(br.readLine());
			int m1 = pl_wt/2;
			int m2 = pl_wt/3;
			int m3 = pl_wt/4;
			
			int exchange_currency = m1 + m2 + m3;
			System.out.println(exchange_currency+" units");
		}catch(Exception e){
			System.out.println("Exception Cought: "+e);
		}
	}
}