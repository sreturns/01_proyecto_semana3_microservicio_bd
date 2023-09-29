package com.sinensia.service;

import java.util.List;
import java.util.Optional;

import com.sinensia.model.Book;

/**
 * Interfaz que implementamos en BookServiceImpl
 * 
 * @see com.sinensia.service.BookServiceImpl
 */
public interface BookService {

	List<Book> getAll();

	void save(Book book);

	void update(Book book);

	Optional<Book> getItemById(int isbn);

	List<Book> delete(int isbn);

}
