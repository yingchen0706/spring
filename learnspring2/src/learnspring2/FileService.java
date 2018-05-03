package learnspring2;

import org.springframework.stereotype.Component;

@Component
public class FileService implements Service {

	@Override
	public void process(int param) {
		System.out.println("FileSevice::Process:" + param);
	}

}
