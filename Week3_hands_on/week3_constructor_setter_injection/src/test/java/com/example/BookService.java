package com.example;

public class BookService {
    private BookRepository bookRepository;


    public BookService(BookRepository bookRepository) {
        System.out.println("Constructor injection executed");
        this.bookRepository = bookRepository;
    }


    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Setter injection executed");
        this.bookRepository = bookRepository;
    }

    public void addBook(String title) {
        bookRepository.save(title);
    }
}
