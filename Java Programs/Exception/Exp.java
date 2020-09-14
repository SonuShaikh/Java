//
class Exp
{
  public static void main(String args[])
  {
      String name[]={"Sonu", "Anu", "monu", " Anita ", "Salman ", "Shaharuk "};
 
         try
		 {
			 for(int i=1; i<=6; i++)
			 {
				 System.out.println(name[i]);
			 }
		 }catch(Exception e)
		 {
			 System.out.println("Exception Caught : "+e);
		 }
 
  }
}