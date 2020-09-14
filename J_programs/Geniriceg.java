class Geniric<G>
{
  Geniric (G parameter)
  {
	  System.out.println(parameter);
  }
}

class Geniriceg
{
	public static void main(String args[])
	{
		Geniric <String> obj= new <String> Geniric("Sonu Shaikh");
		Geniric <Integer> obj1= new <Integer> Geniric(1000);
		Geniric <Double> obj2= new <Double> Geniric(10.004);
		Geniric <Float> obj3= new <Float> Geniric(10.2F);
	}
}