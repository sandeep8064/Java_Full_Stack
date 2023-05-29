package assign2;

public class Customer {

private int customercode;
private String customername;
private String city;
public int getCustomercode() {
	return customercode;
}


public void setCustomercode(int customercode) {
	this.customercode = customercode;
}


public String getCustomername() {
	return customername;
}


public void setCustomername(String customername) {
	this.customername = customername;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public double getOrdervalue() {
	return ordervalue;
}


public void setOrdervalue(double ordervalue) {
	this.ordervalue = ordervalue;
}


private double ordervalue;

public Customer(int customercode, String customername, String city, double ordervalue) {
	super();
	this.customercode = customercode;
	this.customername = customername;
	this.city = city;
	this.ordervalue = ordervalue;
}


public double computeDiscount(double ordervalue)
{
double discount;	
if(ordervalue >25000)
{
	discount = ordervalue*10/100;
}
else if(ordervalue>10000 && ordervalue<=25000)
{
	discount = ordervalue*5/100;
}
else {
	discount=0;
}

return discount;
}

public void show_customer() {
	
	System.out.println("CustomerCode:"+getCustomercode());
	System.out.println("CustomerName:"+getCustomername());
	System.out.println("City:"+getCity());
	System.out.println("OrderValue:"+getOrdervalue());
	System.out.println("Discount:"+computeDiscount(ordervalue));
	System.out.println("NetAmount:"+(getOrdervalue()-computeDiscount(ordervalue)));
	
	
}


	
	
}
