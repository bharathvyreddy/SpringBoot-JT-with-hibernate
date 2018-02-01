package com.springboottest.springbootappone.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springboottest.springbootappone.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
