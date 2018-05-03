package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import learnspring.Auto;
import learnspring.Car;
import learnspring.Engine;

@Configuration
public class CarConfigS {

	@Bean
	public Auto auto(Engine engine) {
		return new Car(engine);
	}
}
