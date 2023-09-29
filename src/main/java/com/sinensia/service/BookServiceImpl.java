package com.sinensia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinensia.dao.BookDao;
import com.sinensia.model.Book;

/**
 * Nuestra clase servicio, inyectamos las interfaz dao que extiende de
 * JpaRepository
 * 
 * @see com.sinensia.dao.BookDao
 */
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao dao;

	/**
	 * Devolvemos todos los libros
	 * 
	 * @return List<Book>
	 */
	@Override
	public List<Book> getAll() {
		return dao.findAll();
	}

	/**
	 * 
	 */
	@Override
	public void save(Book book) {
		dao.save(book);

	}

	/**
	 * 
	 * @return Optional<Book>
	 */
	@Override
	public void update(Book book) {
		dao.save(book);

	}

	/**
	 * 
	 * @return Optional<Book>
	 */
	@Override
	public Optional<Book> getItemById(int isbn) {
		return dao.findById(isbn);
	}

	/**
	 * 
	 * @return List<Book>
	 */
	@Override
	public List<Book> delete(int isbn) {
		dao.deleteById(isbn);
		return dao.findAll();
	}

}
