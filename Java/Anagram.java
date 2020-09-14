import java.util.*; 
import java.io.*;
/* class Anagram{
	
	 public static void main(String[] args){
		 Scanner scan = new Scanner(System.in);
		 String str = scan.nextLine().toLowerCase();
		 int strlen = str.length();
		 String[] strarray ;		
			
		 System.out.println(str);
		 List<String> list = new LinkedList<String>();
		 Set<String> hashset = new HashSet<String>();
		 if(strlen <= 5000){
			
			 strarray = str.split("\\s");
			 String[] strarray1 =  strarray;	
			 //removeDuplicate();
             for(int i = 0; i < strarray.length;i++){
				 strarray1[i] = strarray[i];
			 } 
			  for(int i = 0; i < strarray.length;i++){
				 for(int j = 0; j < strarray1.length; j++){
					 if(strarray[i].length() == strarray1[j].length()){
						
							 char[] s1array = strarray[i].toCharArray();
						     char[] s2array = strarray1[j].toCharArray();
							 Arrays.sort(s1array);
			                 Arrays.sort(s2array);
							 if(Arrays.equals(s1array,s2array)){
								if( strarray[i] != strarray[j])
									 hashset.add(strarray[i]);
								  if(strarray[i].equals(strarray[j])){continue;}else{
								    System.out.println(strarray[i]+" "+strarray[j]);
								 } 
								 //System.out.println(strarray[i]+" "+strarray[j]);
								 System.out.print(strarray[i]+" ");
								 System.out.print(strarray[j]+" ");
								 hashset.add(strarray[i]);
								 hashset.add(strarray[j]); 
								 //strarray = ArrayUtils.remove(strarray, j);
							 }
						
						
					 }
				 }
			  }
			 
              for(String x: list)
                 hashset.add(x); 
   			 for(String x: hashset)
                   System.out.printf("%s ",x);
		 }
 }
} */
class Anagramclass{
	String str,a[],result[];
    StringTokenizer st;
    StringBuffer presenttoken,bz;
    int nooftoken,lenpresenttoken,ct,len,characterMatched,m,n;
    char ch,chara,charb;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	void getInput(){
		 try{
			 str = br.readLine().toLowerCase();
			 convertToTokens();
			 removePunctuation();
			 removeDuplicate();
			 checkAnagram();
		 }catch(Exception e){System.out.println(e);}
	}
	void convertToTokens(){
		st = new StringTokenizer(str);
		nooftoken = st.countTokens();
		a = new String[nooftoken];
		result = new String[nooftoken];
		for(int i = 0; i < nooftoken; i++){
			a[i] = st.nextToken().toString();
		}
	}
	
	
	void removePunctuation(){
        for(int i=0; i<nooftoken; i++){
            presenttoken    = new StringBuffer(a[i]);
            lenpresenttoken = presenttoken.length();
            ch=presenttoken.charAt(lenpresenttoken-1);
            if( (ch=='.') || (ch=='?') || (ch=='!') )
            {
                presenttoken=presenttoken.deleteCharAt(lenpresenttoken-1);
                a[i]=presenttoken.toString();
            }
        }
    }
	
	void removeDuplicate(){
		for(int i = 0; i < (nooftoken - 1); i++){
			for(int j = i +1; j < nooftoken ; j++){
				if(a[i].equals(a[j])){
					a[j] = "";
				}
			}
		}
		displayArray();
	}
	boolean compareL(String str1,String str2){
		if(str1.length() == str2.length())
			return true;
		else
			return false;
	}
	
	void displayArray(){
		for(int i = 0; i < nooftoken ; i++){
			System.out.print(a[i]+" ");
		}
	}
	
	void checkAnagram(){
		for(int i=0; i<(nooftoken-1); i++)
        {
            if(a[i].length()==0)
                continue;
            else
            {
                result[0] = a[i];
                ct=1; 
                for(int j=i+1; j<nooftoken; j++ )
                {
                    if(a[j].length()==0)
                        continue;
                    else
                    {
						   if(compareL(a[i],a[j])){
							   
							   if(isAnagram(a[i],a[j])){
								   //System.out.println(a[i]+" "+a[j]);
								  addIntoResult(a[j],ct);
								  a[j] = "";
								  ct++;
								  //System.out.println(ct++); 
							  }else
								  continue;
						  }
						  else
							  continue;
						}						
					}
				  if(ct!=1){
					displayResult();
					System.out.println();
                  }
				}
			}
		}
	
    boolean isAnagram(String str1,String str2){
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1,c2)){
			return true;
		}else{
			return false;
		}
    }

    void displayResult(){
        for(int i = 0; i<nooftoken; i++)
        {
			System.out.print(result[i]+" ");
        }
    }	
	
	void addIntoResult(String item,int position){
		result[position] = item;
	}
}

class Anagram {
	public static void main(String[] args){
		Anagramclass obj = new Anagramclass();
		obj.getInput();
	}
}
 