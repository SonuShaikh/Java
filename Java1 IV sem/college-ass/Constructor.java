

class Constructor
{
	public static void main(String arg[])
	{
		System.out.println("Count:"+Product.getcount());
		Product obj=new Product(10,"IPHONE 7");
		obj.getdata();
        System.out.println("Count:"+Product.getcount());
Product obj1=new Product(20,"MICROSOFT");
		obj1.getdata();
        System.out.println("Count:"+Product.getcount());
Product obj2=new Product(30,"SONY");
		obj2.getdata();
        System.out.println("Count:"+Product.getcount());		

     }
}
/*
Count:0
THE PRODUCT ID:10
THE PRODUCT NAME:IPHONE 7
Count:1
THE PRODUCT ID:20
THE PRODUCT NAME:MICROSOFT
Count:2
THE PRODUCT ID:30
THE PRODUCT NAME:SONY
Count:3
*/