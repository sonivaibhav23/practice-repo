package vaibhav.practice.repo.springfundamentals.springboot.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {

    private Logger logger = LoggerFactory.getLogger(AfterAopAspect.class);

    @AfterReturning(value = "vaibhav.practice.repo.springfundamentals.springboot.aop.aspect.AspectJoinPointConfig.businessPackageExecution()",
        returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        logger.info("We are doing something after method has returned {} and the return value is {}",
                joinPoint, result);
    }

//    @AfterThrowing(value = "execution(* vaibhav.practice.repo.springfundamentals.springboot.aop.business.*.*(..))",
//        throwing = "exception")
//    public void afterThrowing(JoinPoint joinPoint, Exception exception) {
//        logger.info("We are doing something after method has thrown exception {} and the return exception is {}",
//                joinPoint, exception.getClass());
//    }

}
