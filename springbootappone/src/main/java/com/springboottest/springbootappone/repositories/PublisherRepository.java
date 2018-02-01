package com.springboottest.springbootappone.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springboottest.springbootappone.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
