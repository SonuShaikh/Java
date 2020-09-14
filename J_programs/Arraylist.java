import java.util.*;
class Arraylist
{
 public static void main(String arg[])
 {
	 String array[]={"Aqusa","Samiya", "Saniya", "Shahid", "Salman", "Monu", "Sonu"};
	 
	 ArrayList <String> arraylist= new ArrayList <String> ();
	 
	 for(String str : array)
	 {
		 arraylist.add(str);
	 }
	 for(String s : arraylist)
	 {
		 System.out.println(s);
	 }
	 arraylist.add("Shaikh");
	 arraylist.add("Shahabaj");
	 arraylist.add("Mubarak");
	 arraylist.add("Shaikh");
	 for(String al : arraylist)
		 System.out.println(al);
 }
}