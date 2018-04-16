package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import learnspring.Auto;

public class AutoTestXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("config/CarConfig.xml");
		
		Auto car = context.getBean(learnspring.Auto.class);
		car.run();
		((AbstractApplicationContext)context).close();
	}

}
