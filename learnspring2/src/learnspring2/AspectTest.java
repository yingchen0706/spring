package learnspring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectTest {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ServiceConfig.class);
		
		Service service = (Service)context.getBean(Service.class);
		service.process(5);
		((Auth)service).authorize();
		((AnnotationConfigApplicationContext)context).close();
	}
}
