package ch1.bee.sample.helloworld.aop;

import java.util.Arrays;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
@Aspect
public class AOPConfig {

  @Around("@within(org.springframework.stereotype.Controller)")
  public Object simpleAop(final ProceedingJoinPoint pjp) throws Throwable {
    try {

      Object[] args = pjp.getArgs();
      System.out.println("args:" + Arrays.asList(args));
      Object o = pjp;
      System.out.println("return:" + 0);
      return o;
    } catch (Throwable e) {
      throw e;
    }
  }
}
