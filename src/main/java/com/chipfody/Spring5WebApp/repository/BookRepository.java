package com.chipfody.Spring5WebApp.repository;

import com.chipfody.Spring5WebApp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository  extends CrudRepository<Book, Long> {
}
