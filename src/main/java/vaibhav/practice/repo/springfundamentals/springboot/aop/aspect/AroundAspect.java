package vaibhav.practice.repo.springfundamentals.springboot.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AroundAspect {

    @Around("vaibhav.practice.repo.springfundamentals.springboot.aop.aspect.AspectJoinPointConfig.trackTimeAnnotation()")
    public void trackTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startingTimeStamp = System.currentTimeMillis();
        proceedingJoinPoint.proceed();
        System.out.println("Total time taken by method (in mili seconds) : " + (System.currentTimeMillis() - startingTimeStamp));
    }
}