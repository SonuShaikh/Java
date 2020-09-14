class printMachine<T,V>
{
   T var1;
   V var2;
   
   printMachine(T parameter1, V parameter2)
   {
	   var1 = parameter1;
	   var2 = parameter2;
   }
      void printMethod()
   {
	   System.out.println("The details of Var1 : "+ var1.getClass() .getName() + " "+var1);
	   System.out.println("The details of Var2 : "+ var2.getClass() .getName() + " "+var2);
   }
}
class PrintMachineeg
{
	public static void main(String agr[])
	{
		printMachine <String, Integer> obj= new  printMachine <String, Integer> ("Sonu",100);
	    obj.printMethod();
	}
}