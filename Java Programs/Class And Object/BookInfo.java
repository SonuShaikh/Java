// write a program to displau books name, author and proce for 3 books, Make use of the Array Class object
import java.util.Scanner;
class Book
{
	String book_Name;
	String Author_Name;
	double Price;
	
	void getBooks()
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the Name of the book : ");
		book_Name=Scan.nextLine();
		System.out.println("Enter the Name of the Author :  ");
		Author_Name=Scan.nextLine();
		System.out.println("Enter the Price of the book : ");
		Price = Scan.nextDouble();
	}	
	void display()
	{
		System.out.println(" The Name of the Book Is : "+book_Name);
		System.out.println(" The Name of the Authore Is : "+Author_Name);
		System.out.println(" The Price of the book is :  "+Price);
	}
	
}
class BookInfo
{
	public static void main(String args[])
	{
		Book Stud[]= new Book[3];
		
		for(int i=0;i<Stud.length; i++)
		{
			System.out.println("Enter the Information for Book "+i);
		     Stud[i]= new Book();
			 Stud[i].getBooks();
			
		}
		for(int i=0; i<Stud.length;i++)
		{
			Stud[i].display();
			System.out.println("\n\n\n");
		}
	}
}