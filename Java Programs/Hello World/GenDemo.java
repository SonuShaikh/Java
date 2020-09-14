// Demonstrate user of the Geniric class
class Gen<T>{
	T ob;
	Gen(T o){
		ob = o;
	}
	// return ob
	T getob(){
		return ob;
	}
	// get type of the T objects
	void showType(){
		System.out.println("The Type of T is : "+ ob.getClass().getName());
	}
}

class GenDemo{
	public static void main(String args[]){
		Gen<String> strob = new Gen<String>("Geniric Class");
                strob.showType();
	    String str = strob.getob();// dont need to cast
		System.out.println("Value : "+str);
        Gen<Integer> iob = new Gen<Integer>(10);
         iob.showType();
		 int i = iob.getob();
		 System.out.println("Value : "+i);
	}
}