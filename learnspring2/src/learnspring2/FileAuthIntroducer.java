package learnspring2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class FileAuthIntroducer {
	@DeclareParents(value="learnspring2.Service+", defaultImpl=FileAuth.class)
	public static Auth fileAuth;
}
