//Search Oporation startsWith and endsWith();
class Search{
	public static void main(String[] args){
		String[] words = {"Funk","Chunk","Furry","Baconator"};
		
		//startWith
		for(String w: words)
			if(w.startsWith("Fu"))
				System.out.println(w+" Star With 'Fu'");
		//endsWith
		System.out.println("\n");
		for(String w: words)
			if(w.endsWith("nk"))
				System.out.println(w+" ends with nk");
	}
}