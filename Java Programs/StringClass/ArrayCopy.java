// demonstrate use of the arraycopy();
class ArrayCopy
{  
    static byte a[] = {65,66,67,68,69,70,71,72,73};
	static byte b[] = {77,77,77,77,77,77,77,77,77,};
	public static void main(String args[])
	{
		System.out.println("A : " +new String(a));
		System.out.println("B : "+ new String(b));
		System.arraycopy(a,0,b,0,a.length);
		System.out.println("B : " +new String(b));
		System.arraycopy(b,2,a,0,a.length-2);
		System.out.println("A : "+new String(a));
		
	}
}