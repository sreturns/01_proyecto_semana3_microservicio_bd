package com.sinensia.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinensia.model.Book;

/**
 * 
 * @see com.sinensia.service.BookServiceImpl
 */
public interface BookDao extends JpaRepository<Book, Integer> {

}
