package com.springboottest.springbootappone.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.springboottest.springbootappone.model.Author;
import com.springboottest.springbootappone.model.Book;
import com.springboottest.springbootappone.model.Publisher;
import com.springboottest.springbootappone.repositories.AuthorRepository;
import com.springboottest.springbootappone.repositories.BookRepository;
import com.springboottest.springbootappone.repositories.PublisherRepository;

@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {

	private AuthorRepository authorRepository;
	private BookRepository	bookRepository;
	private PublisherRepository publisherRepository;
	
	
	
	public DevBootStrap(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		// TODO Auto-generated method stub
		initData();
	}
	
	private void initData() {
		Author authorOne= new Author("Rod", "Johnson");
		Publisher publisherOne=new Publisher("Publsher1", "Address1", "city1", "state1", "zip1");
		Book bookOne=new Book("Book Title-1", "001",publisherOne);
		authorOne.getBooks().add(bookOne);
		bookOne.getAuthors().add(authorOne);
		
		Author authorTwo= new Author("Steve", "Json");
		Publisher publisherTwo=new Publisher("Publisher2", "Address2", "city2", "state2", "zip2");
		Book bookTwo=new Book("Book Title-2", "002",publisherTwo);
		authorTwo.getBooks().add(bookTwo);
		bookTwo.getAuthors().add(authorTwo);
		
		publisherRepository.save(publisherOne);
		publisherRepository.save(publisherTwo);
		authorRepository.save(authorOne);
		authorRepository.save(authorTwo);
		bookRepository.save(bookOne);
		bookRepository.save(bookTwo);
		

	}

}
