//Print all Amstrong number between 1 to 500
class Armstrong{
    public static void main(String[] args){
		  int i=1,a,b,c;
		  for(i =1; i<=5000;i++){
			  a = i % 10;
			  b = i % 100;
			  b = (b-a)/10;
			  c = i / 100;
			  if((a*a*a)+(b*b*b)+(c*c*c) == i){
			    System.out.println(i);
		      }
		  }
		   
		 /* int i = 1,a,b,c;
	    while(i <= 5000){
			
		 
		 a = i % 10;
		 b = i % 100;
		 b = (b - a)/10;
		 c = 153  / 100;
		 if((a*a*a)+(b*b*b)+(c*c*c) == i){
			 System.out.println(i);
		 }
		 i++;
		}
		 */
	}
	
}