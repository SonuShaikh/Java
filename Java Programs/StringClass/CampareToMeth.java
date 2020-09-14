//
class CampareToMeth
{
	 static String[] name = {"Sonu", "Monu", "Sahil", "Salman", "Shahid", "Saniya", "SAmiya", "Irfan", "Aqsa", "Ayan", "Ruksar", "Jawed", "Ahemad"};
	
	public static void main(String args[])
	{
		System.out.println("Sorted List of Name : \n");
		for(int i = 0; i < name.length  ; i++)
		{
			for(int j = i ; j<name.length ; j++)
			{
				if(name[j].compareToIgnoreCase(name[i])< 0)
				{
					String t = name[i];
					name[i]  = name[j];
					name[j]  = t;
				}
			}
			System.out.println( name[i]);
		}
	}
}