
class Fist
{
   public static void main(String agr[])
   {
	   int a[]= new int[5];
	   try 
	   {
		  for(int i=0; i<10;i++)
		  {
			  a[i]=i;
		  }
	   }catch(ArrayIndexOutOfBoundsException e)
	   {
		   System.out.println("Exception Caught:"+e);
	   }
	   
   }
}