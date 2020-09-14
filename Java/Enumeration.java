import java.util.EnumSet;
enum EnumEx{
	Sonu("Java","0"),
	Jawed("Photo","10"),
	Pappu("Sport","4"),
	Salman("Mscit","5"),
	Saniya("schl","10"),
	Arif("Actor","44");
	
	private final String desc;
	private final String year;
	
	EnumEx(String description,String experience){
		desc = description;
		year = experience;
	}
	
	public String getDesc(){
		return desc;
	}
	public String getYear(){
		return year;
	}
	
}
public class Enumeration{
	public static void main(String[] args){
		System.out.println("Name\tJob\tExperience");
		for(EnumEx people:EnumEx.values())
			System.out.printf("%s\t%s\t%s yr\n",people,people.getDesc(),people.getYear());
		
		System.out.println("\n Rang EnumSet\n");
		for(EnumEx people:EnumSet.range(EnumEx.Jawed,EnumEx.Salman))
			System.out.printf("%s\t%s\t%s yr\n",people,people.getDesc(),people.getYear());
	}
}