package emp;

public class Address {
  String street;
  String city;
  String state;
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}

public String toString()
{
	return "address:"+street+" /"+city+"/"+state;
}


public String addType()
{
	return "permanent address";
}
  
}
