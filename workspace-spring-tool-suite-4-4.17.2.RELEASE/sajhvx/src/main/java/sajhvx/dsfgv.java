package sajhvx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class dsfgv {
	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
	      Triangle triangle = (Triangle) con.getBean("triangle");
	      
	      triangle.draw();
	}

}
