package com.alihmzyv.transactionalannotationstudy.intro.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class TransactionalDemoImplAspect {

    @Before("execution(public void test1())")
    public void getNameAdvice(){
        log.info("Executing Advice on test1");
    }
}
