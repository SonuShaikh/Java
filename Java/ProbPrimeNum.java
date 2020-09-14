//Probability Of Prime Numbers
import java.util.*;
import java.io.*;
import java.text.*;
class PrimeNumber{
	Scanner scan = new Scanner(System.in);
	String input;
	int[] numbers;
	String[] StringArray;
	
	static int counter = 0;
	double probability;
	
	public void getInput(){
		input = scan.nextLine();
		Conversion(input);
        if(numberChecker(numbers)){
			checkPrimeNumber();
			findProbability();
		}
	}
	public void Conversion(String str){
	    StringArray = input.split("\\s");
		numbers = new int[StringArray.length];
		for(int i=0;i<StringArray.length;i++){
			numbers[i] = Integer.parseInt(StringArray[i]);
		}
	}
	public void checkPrimeNumber(){
		for(int i : numbers){
			if(isPrime(i)){
				counter++;
			}
		}
	}
	public boolean isPrime(int number){
		int flag = 0;
		for(int i = 2; i < number ; i++){
			if(number % i == 0){
				flag = flag + 1;
				break;
			}
		}
		if(flag == 0)
			return true;
		else
			return false;
	}
	
	void findProbability(){
		 probability =  (double)counter / (double)numbers.length;
         DecimalFormat df = new DecimalFormat("#.####");
         System.out.println(df.format(probability));
	}
	
	boolean numberChecker(int[] a){
		boolean tempflag = false;
		for(int x: a){
			if(x > 0 && x <= 9999999){
				tempflag = true;
			}
		}
		if(tempflag)
			return true;
		else
			return false;
	}
}
class ProbPrimeNum{
	public static void main(String[] args){
		PrimeNumber obj = new PrimeNumber();
		obj.getInput();
		
		
	}
}