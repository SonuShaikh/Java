import java.io.*;
class FileWriteDemo{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Name;
		int rollNo;
		String div;
		double per;
		System.out.println("Enter Your Name Please");
		Name = br.readLine();
		System.out.println("Enter Your rollNo");
		rollNo = Integer.parseInt(br.readLine());
		System.out.println("Enter Your Div");
		div = br.readLine();
		String data = "Name :" +Name+"\n"+"RollNO : "+rollNo+"\n"+"Div: "+div;
		
		char buffer[] = new char[data.length()];
		FileWriter fw = new FileWriter("DataFile.txt");
		for(int i = 0; i<buffer.length;i+=2)
			fw.write(buffer[i]);
		fw.close();
	}
}