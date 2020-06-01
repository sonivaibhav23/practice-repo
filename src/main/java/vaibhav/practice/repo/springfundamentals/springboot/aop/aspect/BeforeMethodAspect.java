package vaibhav.practice.repo.springfundamentals.springboot.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeMethodAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * Point Cut format -> execution(* PACKAGE.*.*(..))
     */

    @Before("vaibhav.practice.repo.springfundamentals.springboot.aop.aspect.AspectJoinPointConfig.businessPackageExecution()")
    public void before(JoinPoint joinPoint) {
        logger.info("Before Aspect is called {}", joinPoint);
    }

    @Before("vaibhav.practice.repo.springfundamentals.springboot.aop.aspect.AspectJoinPointConfig.beanStartingWithDao()")
    public void beanStartingWithDao(JoinPoint joinPoint) {
        System.out.println("This is bean which name is starting with dao");
    }

    @Before("vaibhav.practice.repo.springfundamentals.springboot.aop.aspect.AspectJoinPointConfig.withinExecution()")
    public void withinExecution() {
        System.out.println("This is a within exeecution");
    }

}
