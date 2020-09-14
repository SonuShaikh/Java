// StringBuffer sb = new StringBuffer() 
class StringBuf
{
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer("Shaikh Shahabaj mubarak");
		StringBuffer i = new StringBuffer(1234);
		StringBuffer ch = new StringBuffer('c');
		System.out.println("Buffer String : "+sb);
		System.out.println("Length : "+sb.length());
		System.out.println("Capacity : "+sb.capacity());
	}
}