package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import learnspring.MichellinWheel;
import learnspring.Wheel;

@Configuration
@Import({ CarConfigS.class, EngineConfig.class })
// @ImportResource("classpath:config/WheelConfig.xml")
public class CarIntConfig {
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderconfig() {
		PropertySourcesPlaceholderConfigurer conf = new PropertySourcesPlaceholderConfigurer();
		return conf;
	}

	/**
	 * @return
	 */

	@Bean
	public Wheel wheel() {
		return new MichellinWheel();
	}
}
