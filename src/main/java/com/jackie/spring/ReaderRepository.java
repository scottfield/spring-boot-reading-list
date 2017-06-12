package com.jackie.spring;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jackiew on 6/12/2017.
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {
}
