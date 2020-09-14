//demonstrat replace 
class ReplaceDemo
{
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer("This is the Test");
		
		sb.replace(5,7, "Was");
		System.out.println(sb);
	}
}
