package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import learnspring.Engine;
import learnspring.VEightEngine;

@Configuration
public class EngineConfig {

	@Bean
	public Engine engine() {
		return new VEightEngine();
	}
}
