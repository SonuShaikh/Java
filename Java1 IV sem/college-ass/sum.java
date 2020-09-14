// program to sum of the number until user say no;
class sum2
{
	public static void main()
	{
		int n,sum=0;
		String no=new Srting();
		try{
			BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
			do
			{
				n=Integer.parseInt(br.readLine());
				sum=sum+n;
			}while(n=0);
			
		   }catch(Exception e){}
	}
}