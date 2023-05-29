package boot;

public class Topic {

private String name;
private int age;
private String location;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Topic(String name, int age, String location) {
	super();
	this.name = name;
	this.age = age;
	this.location = location;
}

public Topic() {
	super();
	// TODO Auto-generated constructor stub
}


	
}
