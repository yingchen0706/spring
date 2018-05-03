package learnspring2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logger {
	@Pointcut("execution(** learnspring2.Service.process(int)) && args(param)")
	public void process(int param) {
	}

	@Before("process(param)")
	public void beforeRunning(int param) {
		System.out.println("beforeRunning");
	}

	@After("process(param)")
	public void afterRunning(int param) {
		System.out.println("afterRunning");
	}

	@AfterReturning("process(param)")
	public void afterReturnning(int param) {
		System.out.println("afterReturning" + param);
	}

	@AfterThrowing("process(param)")
	public void afterThrowing(int param) {
		System.out.println("afterthrowing" + param);
	}

	@Around("process(param)")
	public void aroundProcess(ProceedingJoinPoint jp, int param) {
		try {
			System.out.println("aroundProcess - before" + param);
			jp.proceed();
			System.out.println("aroundProcess - after" + param);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("aroundProcess - exception" + param);
		}
	}
}
