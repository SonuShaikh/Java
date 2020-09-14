public enum Teamlist{

sonu("programmer","1"),
anita("programmer","2"),
shital("Bitch one","3");

public String desc;
public String OrderNo;

Teamlist(String Description, String order)
{
	desc=Description;
	OrderNo=order;
}
public String gerdesc()
{
	return desc;
}
public String detorder()
{
	return OrderNo;
}
}