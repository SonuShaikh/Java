// Demonstrat use of the BufferedREader
import java.io.*;
class BufferedReaderDemo { 
		public static void main(String args[]) throws IOException { 
		String s = "This is a &copy; copyright symbol " + 
		            "but this is &copy not.\n"; 
					
     		char buf[] = new char[s.length()]; 
		s.getChars(0, s.length(), buf, 0); 
		CharArrayReader in = new CharArrayReader(buf); 
		BufferedReader f = new BufferedReader(in); 
		int c; 
		boolean marked = false;
			
			
			while ((c = f.read()) != -1) { 
			switch(c) { 
				case '&': 
			     if (!marked) { 
				      f.mark(32); 
					  marked = true; 
				} else { 				       
					    marked = false; 
				} 
				
				break; 
				
				case ';': 
				
				if (marked) { 
				marked = false; 
				System.out.print("(c)"); 
		} else 
			System.out.print((char) c); 
		break;

				case ' ': 
				    if (marked) { 
					     marked = false; 
						 f.reset(); 
						 System.out.print("&"); 
			} else 
				System.out.print((char) c); 
					break; 
					default: 
					if (!marked) System.out.print((char) c); 
						break; 
				}
		}
	}
}
/*
C:\Users\sonu\Desktop\Java>java BufferedReaderDemo
This is a (c) copyright symbol but this is &copy not.
*/