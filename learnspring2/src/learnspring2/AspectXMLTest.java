package learnspring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectXMLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("learnspring2/aspect.xml");
		
		Service service = context.getBean(learnspring2.Service.class);
		service.process(6);
		((Auth)service).authorize();
		((AbstractApplicationContext)context).close();
	}

}
