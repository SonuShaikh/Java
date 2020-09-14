// Area
class Area
{
  private double radius;
  private double area;
  
  public Area(double R)
  {
	  radius = R;
	  
	  area = Math.PI*radius*radius;
	  	  
	}
	
	public String toString()
	{
		return "The Area of the Circle is : "+area;
	}
  
}
class AreaOfCircle
{
	public static void main(String args[]){
		Area a = new Area(5.24);
		
		System.out.println("Area :"+a);
	}
}