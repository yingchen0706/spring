package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import learnspring.Auto;
import learnspring.Car;
import learnspring.Engine;
import learnspring.MichellinWheel;
import learnspring.VEightEngine;
import learnspring.Wheel;


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
	
	@Bean
	public Wheel wheel() {
		return new MichellinWheel();
	}
	
	@Bean
	public String brand() {
		return "Benz";
	}
}
