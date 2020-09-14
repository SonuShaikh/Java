import java.io.*;
class LoopEx{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		str = str.replace("\n","");
		System.out.println(str);
		/* int num[] = {1,2,3,4};
		String[] op ={"==","<="};
		int count = 0;
		for(int i=0;i<4;i+=2){
			for(int j=0;j<2;j++){
				System.out.print(num[i]+" "+op[j]+" "+num[i+1]+" ");
				count++;
				if(count == 0)
					continue;
				else
					break;
			}
			System.out.println();
		} */
	}
}