// Print table  2 to 8 using while loop
class TableWhile{
	public static void main(String[] args){
		int table = 2;
		int counter = 1;
		
		System.out.println("Table Of "+table);
		 while(table <= 8){
			
			if(counter == 11){
				table++;
				System.out.println();
				if(table != 9)
					System.out.println("Table of "+table);
				counter = 1;
				
			}else{
				int result = table * counter;
			    System.out.println(result);
				counter ++;
			}
			
		}
	}
}