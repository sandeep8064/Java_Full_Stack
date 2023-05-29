package first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con = new ClassPathXmlApplicationContext("s.xml");
	      Circle triangle = (Circle) con.getBean("triangle");
	      
	      triangle.draw();

	}

}
