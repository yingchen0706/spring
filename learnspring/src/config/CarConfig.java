package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import learnspring.Auto;
import learnspring.Car;
import learnspring.Engine;
import learnspring.VEightEngine;


@Configuration
public class CarConfig {

	@Bean 
	public Engine engine() {
		return new VEightEngine();
	}
	
	@Bean
	public Auto auto() {
		return new Car(engine());
	}
}
