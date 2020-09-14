//Composite 
class Composite{
	public static void main(String[] args){
		potpie pobj = new potpie(12,10,20);
		tuna tobj = new tuna("Sonu",pobj);
		
		System.out.println(tobj);
	}
}
class potpie{
	private int month,day,year;
	
	public potpie(int m,int d,int y){
		month = m;
		day   = d;
		year = y;
		System.out.printf("The Constructor For this %s ",this);
	}
	public String toString(){
		return String.format("%d/%d/%d",month,day,year);
	}
}

class tuna{
	private String name;
	private potpie birthday;
	
	public tuna(String theName,potpie theDate){
		name = theName;
		birthday = theDate;
	}
	public String toString(){
		return String.format("My name is %s, my birthday is %s",name,birthday);
	}
}