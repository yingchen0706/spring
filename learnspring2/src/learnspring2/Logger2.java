package learnspring2;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logger2 {

	public void beforeRunning() {
		System.out.println("beforeRunning");
	}

	public void afterRunning(int param) {
		System.out.println("afterRunning" + param);
	}

	public void afterReturnning(int param) {
		System.out.println("afterReturning" + param);
	}

	public void afterThrowing(int param) {
		System.out.println("afterthrowing" + param);
	}

	public void aroundProcess(ProceedingJoinPoint jp, int param) {
		try {
			System.out.println("aroundProcess - before" + param);
			jp.proceed();
			System.out.println("aroundProcess - after");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("aroundProcess - exception");
		}
	}
}
