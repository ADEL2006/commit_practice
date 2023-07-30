package com.group.libraryapp.repository.book;

import org.springframework.stereotype.Repository;

@Repository
public class BookMemoryRepository implements BookRepository {

    //private final List<Book> books = new ArrayList<Book>();

    @Override
    public void saveBook() {
        System.out.println("MemoryRepository");
    }
}
