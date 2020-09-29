package com.chipfody.Spring5WebApp.repository;

import org.springframework.data.repository.CrudRepository;
import com.chipfody.Spring5WebApp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
