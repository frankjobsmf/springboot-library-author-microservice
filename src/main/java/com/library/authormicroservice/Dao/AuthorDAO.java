package com.library.authormicroservice.Dao;

import com.library.authormicroservice.Entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorDAO  extends CrudRepository<Author, Long> {
}
