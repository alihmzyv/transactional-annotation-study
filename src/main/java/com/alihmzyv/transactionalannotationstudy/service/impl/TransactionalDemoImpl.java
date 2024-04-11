package com.alihmzyv.transactionalannotationstudy.service.impl;

import com.alihmzyv.transactionalannotationstudy.entity.Book;
import com.alihmzyv.transactionalannotationstudy.repository.BookRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class TransactionalDemoImpl {
    private final BookRepository bookRepository;

    @SneakyThrows
    @Transactional(rollbackOn = Exception.class)
    public void test1() throws Exception {
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
        callTest1();
    }
}
