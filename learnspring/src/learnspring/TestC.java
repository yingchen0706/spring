package learnspring;

public class TestC {
	
	private Wheel wheel;

	public TestC(Wheel wheel) {
		this.wheel = wheel;
	}
	
	public void test() {
		if (wheel != null) {
			wheel.roll();
		}
	}
}
