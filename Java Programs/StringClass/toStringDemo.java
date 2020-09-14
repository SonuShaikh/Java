// demonstrate use of the toString methods
class Box
{
   private double width;
   private double hieght;
   private double defth;
   
   
   public Box(double w, double h, double d)
   
   {
	   width = w;
	   hieght= h;
	   defth = d;
   }
   public  String toString()
   {
	   return "Dimension is : "+width+ " by "+ hieght + " by " +defth+ "." ;
   }
   
}

class toStringDemo
{
	public static void main(String agrs[])
	{
		Box b = new Box(10,20,29);
		String s = "Box :" +b;
		System.out.println(b);
		System.out.println(s);
	}
}