// Demonstrate use of the ordinal(), compairTo() and equals() method
enum Friends
{
	Sonu,Anita,Sahil,Shah,Salman_Khan, Gayle, SRK;
}
class FriendsEnum
{
	public static void main(String args[])
	{
		Friends f;
		Friends f1;
		Friends f2;
		
		System.out.println("Here is the Constant and Orinal Values");
		
		for(Friends F : Friends.values())
		{
			System.out.println(F+"\t"+F.ordinal());
		}
		
		
	}
}