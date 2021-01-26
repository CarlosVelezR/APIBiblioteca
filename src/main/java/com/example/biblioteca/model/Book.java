package com.example.biblioteca.model;

import java.util.UUID;

public class Book {

    private final UUID id;
    private final String Title;

    public Book(UUID id, String title) {
        this.id = id;
        Title = title;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return Title;
    }
}
