// write program to display product name priduct id price and quality and calculate total amount of product
class Product
{
	int product_id;
	String pr_name;
	int price;
	
	int quality;
	int total_amount;
	public void getdata(int id, String s, int p,int q)
	{
		product_id=id;
		pr_name=s;
		price=p;
		quality=q;
	}
	public void calculate()
	{
		total_amount=price*quality;
	}
	public void display()
	{
		System.out.println("Product_ID="+product_id);
		System.out.println("Product Name="+pr_name);
		System.out.println("Product Price="+price);
		System.out.println("Product Quality="+quality);
	}
}