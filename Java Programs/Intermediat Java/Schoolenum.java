// 
enum School
{
	Books, NoteBooks, Pen, Pencile, Shopneers, SchBag;
}
class Schoolenum
{
	public static void main(String args[])
	{
		School Ray[] = School.values();
		System.out.println("The contant of the School");
		for(School S : Ray)
		{
			System.out.println(S);
		}
		
		System.out.println();
		
		School sc;
		sc = School.valueOf("NoteBooks");
		System.out.println("The VAlues of : "+sc);
	}
}