// program to the supplying the language name from command line and couting them.
class Language
{
    public static void main(String args[])
    {
      String s;
      Int count, i;
      count= args.length;
      System.out.println("Total number of arguments="+count);
      for(i=0;i<count;i++)
       {
          System.out.println(args[i]);
        } 

     }

}