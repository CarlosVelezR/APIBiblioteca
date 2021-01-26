package com.example.biblioteca.dao;

import com.example.biblioteca.model.Book;

import java.util.UUID;

public interface BookDao {

    int insertBook (UUID id, Book book);

    default int insertBook(Book book){

        UUID id = UUID.randomUUID();

        return insertBook(id, book);
    }

}
