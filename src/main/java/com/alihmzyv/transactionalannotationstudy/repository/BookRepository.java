package com.alihmzyv.transactionalannotationstudy.repository;

import com.alihmzyv.transactionalannotationstudy.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
