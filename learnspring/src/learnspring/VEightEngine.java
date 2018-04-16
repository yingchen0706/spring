package learnspring;

import org.springframework.stereotype.Component;

@Component
public class VEightEngine implements Engine {
	@Override
	public void start() {
		System.out.println("V8 engine start!");
	}
}
