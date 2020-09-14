// conver an intger number into binary hex decimal & 

class Conversion
{
	public static void main(String args[])
	{
		int num=1254963;
		
		System.out.println("Binary Number Of "+ num + " Is : "+Integer.toBinaryString(num));
		System.out.println("Octal of "+ num + " is  " +Integer.toOctalString(num));
		System.out.println("HexDesimal of "+num+ " is  "+Integer.toHexString(num));
		
	}
}