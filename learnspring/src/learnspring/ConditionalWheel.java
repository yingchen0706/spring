package learnspring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("blabla")
public class ConditionalWheel implements Wheel {

	@Override
	public void roll() {
		// TODO Auto-generated method stub
		System.out.println("Conditional Wheel running");
	}

}
