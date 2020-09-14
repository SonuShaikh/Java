// Stact Example
import java.io.*;
import java.util.*;
class StackExample{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<String> stack = new Stack<String>();
		String[] stackArray;
		String[] operationArray;
		try{
			String StackData = br.readLine();
			stackArray = StackData.split("\\s");
			for(String x: stackArray)
				stack.push(x);
			//System.out.println(stack);
			int numOfOperations = Integer.parseInt(br.readLine());
			if(numOfOperations >= 1 && numOfOperations <= 1000){
				for(int i =0; i < numOfOperations; i++){
				String operationData = br.readLine();
				operationArray = operationData.split("\\s");
				if(operationArray[0].equals("-1")){
					stack.pop();
				}else if(operationArray[0].equals("1")){
					for(int j = 1; j < operationArray.length; j++){
						stack.push(operationArray[j]);
					}
				}
			  }
			  for(String y: stack)
				System.out.printf("%s ",y);
			  
			}
		}catch(Exception e){System.out.println(e);}
	}
}