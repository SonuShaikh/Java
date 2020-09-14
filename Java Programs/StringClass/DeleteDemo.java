// Demonstrate use of the delete()
class DeleteDemo
{
	public static void main(String arg[])
	{
		StringBuffer sb = new StringBuffer("This is the java Program");
		System.out.println("The Original String : "+sb);
		
		
		sb.delete(4,7);
		System.out.println("After The Deleting : "+sb);
		
		sb.deleteCharAt(0);
		System.out.println("DeleteCharAt : "+sb);
		
	}
}