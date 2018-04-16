package learnspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car implements Auto {
	private Engine engine;
	private Wheel wheel;
	
	//@Value("${brand: benz}")
	//private String brand;

	@Autowired
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	@Autowired
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	
	/*public void setBrand(String brand) {
		this.brand = brand;
	}*/

	@Override
	public void run() {
		engine.start();
		wheel.roll();
		System.out.println("Car run!");
	}

}
