package com.spring;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ApplicationContext con = new ClassPathXmlApplicationContext("sp.xml");
	      Shapes triangle = (Shapes) con.getBean("triangle");
	      
	      triangle.draw();
		
		
		
		
	}

}
