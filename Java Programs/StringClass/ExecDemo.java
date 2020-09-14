// demonstrare exec()
class ExecDemo
{
	public static void main(String args[])
	{
		Runtime r = Runtime.getRuntime();
		Process p = null;
		
		try
		{
			p = r.exec("notepad");
			p.waitFor();
		}catch(Exception e)
		{
			System.out.println("Exectutin Error"+e);
		}
		System.out.println("notepad Return : "+p.exitValue());
	}
}