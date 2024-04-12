package com.alihmzyv.transactionalannotationstudy;

import com.alihmzyv.transactionalannotationstudy.service.impl.TransactionalDemoImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class Starter implements CommandLineRunner {
    private final TransactionalDemoImpl transactionalDemo;
    private final ApplicationContext appContext;

    @Override
    public void run(String... args) throws Exception {
        log.info("Beans of type TransactionalDemoImpl: {}", appContext.getBeansOfType(TransactionalDemoImpl.class));
        log.info("Injected type: {}", transactionalDemo.getClass());
//        transactionalDemo.callTest1(); //does not cause the advice to be executed due to proxy pattern design

//        transactionalDemo.test1();

        transactionalDemo.test1();
    }
}
