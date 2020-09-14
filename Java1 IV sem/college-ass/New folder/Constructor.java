class Product
{
	private int pro_id;
	private String pro_name;
	static int count=0;
	Product(int id, String name)
	{
		pro_id=id;
		pro_name=name;
		count++;
		
	}
	void getdata()
	{
		System.out.println("THE PRODUCT ID:"+pro_id);
		System.out.println("THE PRODUCT NAME:"+pro_name);
	}
	 static int getcount()
	{
		return(count);
	}
}
class Constructor
{
	public static void main(String arg[])
	{
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
			int a[]=new int[5];
			String name=new String[5];
			System.out.println("Enter the values for the ARRAY");
			for(int i=0;i<=5;i++)
			{     
		        
				a[i]=Integer.parseInt(readLine());
			}
			System.out.println("Enter the values for the NAME");
			for(int i=0;i<=5;i++)
			{
				name[i]=readLine();
			}
            for(int i=0;i<=5;i++)
			{
				for(int i=0;i<=5;i++)
				{
					
				}
			}
			
		}catch(Exception e){}
        System.out.println("Count:"+Product.getcount());		

     }
}