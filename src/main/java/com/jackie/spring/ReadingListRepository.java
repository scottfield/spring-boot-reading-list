package com.jackie.spring;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by jackiew on 6/12/2017.
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
