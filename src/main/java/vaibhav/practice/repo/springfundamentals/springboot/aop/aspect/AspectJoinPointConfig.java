package vaibhav.practice.repo.springfundamentals.springboot.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class AspectJoinPointConfig {

    @Pointcut("execution(* vaibhav.practice.repo.springfundamentals.springboot.aop.business.*.*(..))")
    public void businessPackageExecution() {}

    @Pointcut("bean(dao*)")
    public void beanStartingWithDao() { }

    @Pointcut("within(vaibhav.practice.repo.springfundamentals.springboot.aop.business..*)")
    public void withinExecution() {}

    @Pointcut("@annotation(vaibhav.practice.repo.springfundamentals.springboot.aop.annotation.TrackTime)")
    public void trackTimeAnnotation() {}
}
