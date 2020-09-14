// Program for student information by using Array of object

  class Studentinfo
	{
		public static void main(String sonu[])
		{
			int i;
			student st[]=new student[5];
		/* 	for(i=1; i<5; i++)
			{
				st[i]=new Student();
			}
 */			
 
 for(i=1; i<5; i++)
			{
				st[i].getdata();
			}
			for(i=1;i<5;i++)
			{
				st[i].display();
			}
			
		}
	}
