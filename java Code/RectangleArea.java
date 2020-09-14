//Class And Object
class Rectange{
	int length;
	int breadth;
	
	void input(){
		length = 10;
		breadth = 20;
	}
	 void calculate(){
		 int a ;
		 a = length * breadth;
		 System.out.println("Area of the Rectangle "+a);
	 }
}
class RectangleArea{
	public static void main(String[] args){
		Rectange rect = new Rectange();
		rect.input();
		rect.calculate();
	}
}