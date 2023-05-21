package com.polarbookshop.catalogservice.exception;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String isbn) {
        super("A book with ISBN " + isbn + " already exists.");
    }
}
