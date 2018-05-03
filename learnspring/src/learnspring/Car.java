package learnspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:/learnspring/test.properties")
public class Car implements Auto {
	private Engine engine;
	private Wheel wheel;

	private String brand;
	@Autowired
	private Environment env;

	@Autowired
	public Car(Engine engine) {
		this.engine = engine;
	}

	@Autowired
	@brand
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	@Autowired
	public void setBrand(@Value("${brand}") String brand) {
		this.brand = brand;
	}

	@Override
	public void run() {
		
		engine.start();
		if (wheel != null) {
			wheel.roll();
		}

		System.out.println(env.getProperty("brand"));
		System.out.println(brand);
		System.out.println("Car run!");
	}

}
