package learnspring2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class ServiceConfig {
	@Bean
	public Logger logger() {
		return new Logger();
	}
	@Bean
	public FileAuthIntroducer fileAuthIntroducer() {
		return new FileAuthIntroducer();
	}
}
