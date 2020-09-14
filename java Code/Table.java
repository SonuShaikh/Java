// Write a program to print a table of 2 to 5
class Table{
	public static void main(String[] args){
		for(int i = 2;i<=5;i++){
			System.out.println(" Table of "+i);
			for(int j=1;j<=10;j++){
				System.out.println(i*j);
			}
		}
	}
}