class Rectangle
 {
     int lentgh;
     int breadth;
  void input()
	{
             lentgh=50;
 	     breadth=70;
             calculate();
		}
      void calculate()
{
    
    int area;
    area=lentgh*breadth;
    System.out.println("Area of Rectangle is ="+area);
}

 }
class Arearect
{
    public static void main(String sonu[])
   {
    Rectangle obj= new Rectangle();
    obj.input();   
 
  }

}