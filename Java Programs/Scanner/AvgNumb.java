// Use The Scanner To compute The Average of The Number
import java.util.*;
class AvgNumb{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = 0;
		double sum = 0.0;
		System.out.println("Enter The Numbers ");
		
		while(scan.hasNext()){
			if(scan.hasNextDouble()){
				sum +=scan.nextDouble();
				count++;
			}
			else{
				String str = scan.next().toLowerCase();
				if(str.equals("done")){
					break;
				}
				else{
					System.out.println("Wrong Data Format");
				}
			}
		}
		System.out.println("Average : "+sum/count);
	}
}