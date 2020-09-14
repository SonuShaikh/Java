import java.io.*;
import java.util.*;
class Anagram{
    String str,array[],result[];
    StringTokenizer st;
    StringBuffer presenttoken,bz;
    int nooftoken,i,lenpresenttoken,j,count,len,matches,m,n;
    char ch,chara,charb;
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    void getInput()throws IOException{     
        str=in.readLine();
        str=str.toLowerCase();
        convertToTokens();
        removePunctuation();
        norepeats();
        checkAnagram();
    }
    void convertToTokens()
    {
        st=new StringTokenizer(str);
        nooftoken=st.countTokens();
        array=new String[nooftoken];
        result=new String[nooftoken];
        for(i=0; i<nooftoken; i++)
        {
            array[i]=st.nextToken().toString();
        }
    }
    void removePunctuation()
    {
        for(i=0; i<nooftoken; i++)
        {
            presenttoken=new StringBuffer(array[i]);
            lenpresenttoken=presenttoken.length();
            ch=presenttoken.charAt(lenpresenttoken-1);
            if( (ch=='.') || (ch=='?') || (ch=='!') )
            {
                presenttoken=presenttoken.deleteCharAt(lenpresenttoken-1);
                array[i]=presenttoken.toString();
            }
        }
        /*System.out.println("\nArray after removing punctuation :: \n");
        display();*/
    }

    void norepeats()
    {
        for(i=0; i<(nooftoken-1); i++)
        {
            for(j=i+1; j<nooftoken; j++)
            {
                if(array[i].equals(array[j]))
                    array[j]="";
            }
        }
        /*System.out.println("\nString after no repeats :: \n");
        display();*/
    }
    void display()
    {
        for(i=0; i<nooftoken; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    void checkAnagram(){
        for(i=0; i<(nooftoken-1); i++){
            if(array[i].length()==0)
                continue;
            else{
                result[0]=array[i];
                count=1;
                for(j=i+1; j<nooftoken; j++){
                    if(array[j].length()==0)
                        continue;
                    else{
                        if(compareL(array[i],array[j])){
                            if(isAnagram(array[i],array[j])){
                                addIntoResult(array[j],count);
                                array[j]="";
                                count++;
                            }
                            else{
                                continue;
                            }
                        }else{
                            continue;
                        }
                    }
                }
                if(count!=1){
					displayResult();
					System.out.println();
                }
            }
        }
    }
    boolean compareL(String str1,String str2){
		if(str1.length() == str2.length())
			return true;
		else
			return false;
	}
    boolean isAnagram(String a,String b)
    {
        bz=convertToStringBuffer(b);
        len=a.length();
        matches=0;
        for(m=0; m<len; m++)
        {
            chara=a.charAt(m);
            for(n=0; n<len; n++)
            {
                charb=bz.charAt(n);
                if(chara==charb)
                {
                    matches=matches+1;
                    bz.deleteCharAt(n);
                    bz.insert(n,' ');
                    break;
                }
                else
                {
                    continue;
                }
            }
        }
        if(matches==len)
            return true;
        else
            return false;
    }
    StringBuffer convertToStringBuffer(String str)
    {
        return(new StringBuffer(str));
    }
    void addIntoResult(String item,int position){
		result[position] = item;
	}
    void displayResult()
    {
        for(int u=0; u<count; u++)
        {
            System.out.print(result[u]+" ");
        }
    }           
}
class NewAnagram
{
    public static void main(String args[])throws IOException
    {
        Anagram ob=new Anagram();
        ob.getInput();
    }
}