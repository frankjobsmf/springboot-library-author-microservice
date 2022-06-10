package com.library.authormicroservice.Repository;

import com.library.authormicroservice.Entity.Author;

import java.util.List;

public interface IAuthor {

    public List<Author> getAll();
    public Author getAuthorById(Long id);
    public void saveAuthor(Author author);
}
