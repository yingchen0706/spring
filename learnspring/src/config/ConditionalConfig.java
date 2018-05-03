package config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import learnspring.ConditionalWheel;
import learnspring.TestC;
import learnspring.Wheel;

@Configuration
public class ConditionalConfig {
	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public TestC testC() {
		return new TestC(wheel());
	}

	@Bean
	@Conditional(TestCondition.class)
	public Wheel wheel() {
		return new ConditionalWheel();
	}
}
