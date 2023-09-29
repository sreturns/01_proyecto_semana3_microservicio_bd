package com.sinensia.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.model.Book;
import com.sinensia.service.BookService;

/**
 * Clase controlador
 * 
 * @author Sergio
 * @see com.sinensia.service.BookServiceImpl
 * @see com.sinensia.service.BookService
 */
@RestController
public class BookController {

	/**
	 * Inyectamos nuestro servicio
	 */
	@Autowired
	private BookService service;

	/**
	 * 
	 * @return List<Book>
	 */
	@GetMapping(value = "book", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> getAll() {
		return service.getAll();
	}

	/**
	 * 
	 * @param isbn
	 * @return Optional<Book>
	 */
	@GetMapping(value = "book/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Book> getItemById(@PathVariable("isbn") int isbn) {
		return service.getItemById(isbn);
	}

	/**
	 * 
	 * @param book
	 */
	@PostMapping(value = "book", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void save(@RequestBody Book book) {
		service.save(book);
	}

	/**
	 * 
	 * @param book
	 */
	@PutMapping(value = "book", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody Book book) {
		service.update(book);
	}

	/**
	 * 
	 * @param isbn
	 * @return List<Book>
	 */
	@DeleteMapping(value = "book/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> delete(@PathVariable("isbn") int isbn) {
		return service.delete(isbn);
	}
}
