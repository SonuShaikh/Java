// TinyNotepad
import java.io.*;
class TinyEdit{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[]= new String[100];
		
		System.out.println("Enter The Text of Lines");
		System.out.println("Enter The 'Stop' To Exit");
		for(int i = 0; i<100;i++){
			str[i]= br.readLine();
			if(str[i].equals("Stop"))
				break;
		}
		System.out.println("this is your file");
		for(int i = 0 ; i<100; i++){
			
			if(str[i].equals("Stop"))
				break;
				
			System.out.println(str[i]);
		}
		
	}
}