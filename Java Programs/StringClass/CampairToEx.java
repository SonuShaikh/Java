// Compairer to String Method compairTo()
class CampareToEx
{
	public static String arr[]= {"Hello", "hey", "is", "Anita", "sonu", "satic", "public", "not", "now", "There", "this", "man"};
	
	public static void main()
	{
		for(int i = 0; i<arr.lenght; i++)
		{
			for(int j = 1; j<arr.lenght ; j++)
			{
				if arr[j].compareTo(arr[i] < 0)
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