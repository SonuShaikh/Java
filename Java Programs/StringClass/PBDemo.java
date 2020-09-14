// demonstrate use of the ProcessBuilder
class  PBDemo
{
	public static void main(String args[])
	{
		try
		{
			ProcessBuilder pb = new ProcessBuilder("notepad.exe","CharWrap.txt");
			pb.start();
		}catch(Exception e)
		
		{
			System.out.println("Exception is Caught : "+e);
		}
	}
}