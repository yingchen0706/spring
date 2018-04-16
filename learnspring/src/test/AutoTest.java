package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learnspring.Auto;

public class AutoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(config.CarConfig.class);
		
		Auto car = context.getBean(learnspring.Auto.class);
		car.run();
		((AnnotationConfigApplicationContext)context).close();
	}

}
