// Compairer to String Method compairTo()
class CampareToEx
{
	public static String arr[]= {"Hello", "hey", "is", "Anita", "sonu", "satic", "public", "not", "now", "There", "this", "man"};
	
	public static void main(String args[])
	{
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i; j<arr.length ; j++)
			{
				if (arr[j].compareToIgnoreCase(arr[i]) < 0)
				{
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
	}
}