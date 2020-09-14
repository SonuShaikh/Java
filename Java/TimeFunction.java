// Time function
class TimeFunction{
	public static void main(String[] args){
		MilitaryTime obj = new MilitaryTime();
		
		System.out.println(obj.toMilitary());
		System.out.println(obj.toString());
		 obj.setTime(13,44,60);
		System.out.println("Military Time "+obj.toMilitary());
		System.out.println("Regular Time "+obj.toString());
	}
}
class MilitaryTime{
	private int hour;
	private int minuts;
	private int second;
	
	public void setTime(int h,int m,int s){
		hour   = ((h>=0 && h<24) ? h : 0);
		minuts = ((m>=0 && h<60) ? m : 0);
		second = ((s>=0 && s<60) ? s : 0);		  
	}
	
	public String toMilitary(){
		return String.format("%02d:%02d:%02d",hour,minuts,second);
	}
	public String toString(){
		return String.format("%d:%02d:%02d %s",((hour==0||hour==12) ? 12:hour%12),minuts,second,hour < 12 ? "AM":"PM");
	}
}