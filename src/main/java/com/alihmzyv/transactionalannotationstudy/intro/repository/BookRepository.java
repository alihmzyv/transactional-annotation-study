package com.alihmzyv.transactionalannotationstudy.intro.repository;

import com.alihmzyv.transactionalannotationstudy.intro.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
