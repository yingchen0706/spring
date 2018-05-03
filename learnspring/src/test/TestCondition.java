package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learnspring.TestC;


public class TestCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(config.ConditionalConfig.class);

		/*Wheel wheel = context.getBean(learnspring.Wheel.class);
		if (wheel != null) {
			wheel.roll();
		}*/
		TestC tx=context.getBean(TestC.class);
		TestC tx2=context.getBean(TestC.class);
		System.out.println(tx == tx2);
		tx.test();
		((AnnotationConfigApplicationContext) context).close();
	}

}
