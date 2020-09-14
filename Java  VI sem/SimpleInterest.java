//Write a program to Calculate simple interest by using Formula PNR/100
//Principle(Int),N= Duration(Float),R = rate(Double);
import java.io.*;
class SimpleInterest{
	public static void main (String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Enter the Principal Amount (integer)");
			int P = Integer.parseInt(br.readLine());
			Integer iob = new Integer(P);
			
			System.out.println("Enter the Duration(Float)");
			float N = Float.valueOf(br.readLine());
			Float fob = new Float(N);
			
			System.out.println("Enter The Interest Rate(Double)");
			double R = Double.parseDouble(br.readLine());
			Double dob = new Double(R);
			
			double SI = (iob.intValue()* fob.floatValue()*dob.doubleValue())/100;
			System.out.println("Simple Interest : "+SI);
		}catch(IOException e){
			System.out.println("Input Outpur Exception Error "+e);
		}
		
		catch(NumberFormatException e){
			System.out.println("Data Type Mismatch");
		}
	}
}
/*
Output :
Enter the Principal Amount (integer)
5000
Enter the Duration(Float)
1.8
Enter The Interest Rate(Double)
2.5
Simple Interest : 225.0
*/