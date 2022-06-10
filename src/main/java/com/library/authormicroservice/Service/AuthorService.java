package com.library.authormicroservice.Service;

import com.library.authormicroservice.Dao.AuthorDAO;
import com.library.authormicroservice.Entity.Author;
import com.library.authormicroservice.Repository.IAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AuthorService implements IAuthor{

    @Autowired
    private AuthorDAO authorDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Author> getAll() {
        return (List<Author>) authorDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Author getAuthorById(Long id) {
        return authorDAO.findById(id).orElse(null);
    }

    @Override
    public void saveAuthor(Author author) {
        authorDAO.save(author);
        return;
    }
}
