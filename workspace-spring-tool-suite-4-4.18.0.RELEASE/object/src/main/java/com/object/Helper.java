package com.object;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Helper implements InitializingBean, DisposableBean{

private	int num;


public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public void draw()
{
	System.out.println(num);
	
}

}
//public void setBeanName(String name) {
//	// TODO Auto-generated method stub
//	System.out.println("Name:"+name);
//}
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Initialising");
}
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Destroying");
}
	
}
