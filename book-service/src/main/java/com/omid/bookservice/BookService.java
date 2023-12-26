package com.omid.bookservice;

import com.querydsl.core.BooleanBuilder;
import jdk.dynalink.linker.LinkerServices;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final QBook qBook=QBook.book;

    public List<Book> findAllBook() {
        return bookRepository.findAll();
    }

    public Book findOneBook(Integer id) {
        return bookRepository.getBookById(id);
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(Integer id, Book book) {
        Book dbBook = findOneBook(id);
        if (book.getTitle() != null) {
            dbBook.setTitle(book.getTitle());
        }
        if (book.getWriter() != null) {
            dbBook.setWriter(book.getWriter());
        }
        if (book.getWarehouseAddress() != null) {
            dbBook.setWarehouseAddress(book.getWarehouseAddress());
        }
        if (book.getCount() != null) {
            dbBook.setCount(book.getCount());
        }

        return bookRepository.saveAndFlush(dbBook);
    }

    public List<Book> search(String keyword){
        return bookRepository.searchBook("%"+keyword+"%");
    }

}


