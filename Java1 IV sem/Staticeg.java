// program to use of the static members product examples to count the total number of the used objects
class Staticeg
{
	int ID;
	String name;
	 static int count;
	public void getdata(int id, String nam)
	{
		ID=id;
		name=nam;
		count++;
	}
	 static int getcount()
	{
		return(count);
	}
	public void display()
	{
		System.out.println("Product id ="+ID);
		System.out.println("Product Name="+name);
	}
}