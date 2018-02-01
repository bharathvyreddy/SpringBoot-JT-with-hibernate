package com.springboottest.springbootappone.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springboottest.springbootappone.model.Book;

public interface BookRepository extends CrudRepository<Book,Long> {

}
