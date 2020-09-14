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