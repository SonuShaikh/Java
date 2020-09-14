// Genirics Methods With void return of 
import java.util.*;
class GmethodVoid
{
	public static <G> void ShowArray( G[] A)
	{
		for(G S : A)
		{
			System.out.printf("%s ", S);
		}
		System.out.println();
	}
    public static void main(String args[])
	{
		String[] sray ={"Apple" , "Microsoft", "Google", "Facebook", " Youtube", "Hike"};
		Integer[] iray={1,2,3,4,5,6,7,8,9};
		Character[] cray={'S', 'O', 'N','U'};
		Double[] dray={1.2,3.4,5.6,7.8,9.8};
		
		ShowArray(sray);
		ShowArray(iray);
		ShowArray(cray);
		ShowArray(dray);
	}
}