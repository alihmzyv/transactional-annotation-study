package com.alihmzyv.transactionalannotationstudy.intro.service.impl;

import com.alihmzyv.transactionalannotationstudy.intro.annotation.Loggable;
import com.alihmzyv.transactionalannotationstudy.intro.entity.Book;
import com.alihmzyv.transactionalannotationstudy.intro.repository.BookRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class TransactionalDemoImpl {
    private final BookRepository bookRepository;

    @SneakyThrows
    @Loggable
    @Transactional(rollbackOn = Exception.class)
    public void test1() {
        log.info("Class: {}", this.getClass());
        Book book1 = new Book();
        book1.setName("Book 1");
        bookRepository.save(book1);
        if (true) {
            throw new Exception("Something went wrong");
        }
        Book book2 = new Book();
        book2.setName("Book 2");
        bookRepository.save(book2);
    }


    public void callTest1() {
        test1();
    }
}
