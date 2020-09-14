// String Methods
class Sonu
{

          public static void main(String args[])
		  {
			  String name[]={"Anita", "Anikita", "Aniketa", "Anjali", "Anjum", "Sonu", "Shaikh"};
			  System.out.println("Name Start with 'An' ");
			  // startsWith
			  for(String w : name)
			  {
				  if(w.startsWith("An"))
				  {
					  System.out.println(w);
				  }
			  }
			  
			  System.out.println("Names End With ta");
			  
			  // endsWith
			  for(String m : name)
				  if(m.endsWith("ta"))
					  System.out.println(m);
		  }
}