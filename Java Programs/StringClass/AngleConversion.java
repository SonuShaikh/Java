// Demonstrat the toDegrees and toRadians
class AngleConversion
{
	public static void main(String args[])
	{
		double theta = 120.00;
		
		System.out.println(theta+ " Degree is "+Math.toRadians(theta) + " Radians");
		
		
		System.out.println(Math.toRadians(theta)+ " Radinans is "+Math.toDegrees(theta) + " Degree");
	}
}