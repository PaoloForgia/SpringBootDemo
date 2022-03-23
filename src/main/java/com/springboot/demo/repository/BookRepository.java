package com.springboot.demo.repository;

import com.springboot.demo.model.Book;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findByTitle(String title);
}
