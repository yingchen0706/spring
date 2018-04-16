package learnspring;

import org.springframework.stereotype.Component;

@Component
public class MichellinWheel implements Wheel {

	@Override
	public void roll() {
		System.out.println("Michellin wheel rolling!");
	}

}
