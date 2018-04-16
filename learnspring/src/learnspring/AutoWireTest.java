package learnspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
@Component
class AutoWireTest1 {

	@Autowired
	private Auto car;

	public void execute() {
		car.run();
	}

}

public class AutoWireTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(config.AutoWireConfig.class);

		AutoWireTest1 car = (AutoWireTest1) context.getBean(AutoWireTest1.class);
		car.execute();
		((AnnotationConfigApplicationContext) context).close();

	}
}