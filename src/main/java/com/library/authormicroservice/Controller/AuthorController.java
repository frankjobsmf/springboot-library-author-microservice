package com.library.authormicroservice.Controller;


import com.library.authormicroservice.Entity.Author;
import com.library.authormicroservice.Repository.IAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    @Autowired
    private IAuthor iAuthor;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Author> getAll(){
        return iAuthor.getAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Author getAuthorById(@PathVariable Long id){
        return iAuthor.getAuthorById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void SaveAuthor(@RequestBody Author author){
        iAuthor.saveAuthor(author);
        return;
    }

}
