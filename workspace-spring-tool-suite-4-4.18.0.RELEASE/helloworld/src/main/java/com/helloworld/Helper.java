package com.helloworld;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Helper implements InitializingBean,DisposableBean {

	public void help()
	{
		System.out.println("Hello World");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Ended");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Started");
		
	}
}
