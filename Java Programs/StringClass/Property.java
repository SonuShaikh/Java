// demonstrate property
class Property
{
	public static void main(String args[])
	{
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("class.path"));
		System.out.println(System.getProperty("java.compiler"));
		System.out.println(System.getProperty("java.vm.name"));
		System.out.println(System.getProperty("java.vm.version"));
		System.out.println(System.getProperty("line.separator"));
	}
}