public enum tuna
{
	sonu("Nice Boy",19),
	Shaikh("Sir Name",80),
	Mubarak("Father",43);
	
	private  String desc;
	private String year;
	
	public tuna(String description, String bday)
	{
		desc=description;
		year=bday;
	}
	public String getDescription()
	{
		return desc;
	}
	public String getYear()
	{
		return year;
	}
}