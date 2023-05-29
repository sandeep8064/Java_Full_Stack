package com.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("obj.xml");
		Helper triang = (Helper) context.getBean("triangle");
		triang.draw();
		
	}

}
