package com.alihmzyv.transactionalannotationstudy.intro.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class LoggableAspect {
    @Before("@annotation(com.alihmzyv.transactionalannotationstudy.intro.annotation.Loggable)")
    public void myAdvice(){
        log.info("Executing @Loggable advice");
    }
}
