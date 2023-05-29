package assign3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BatchLocationInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
		Location batch = (Location) context.getBean("location");
		batch.displayinfo();

	}

}
