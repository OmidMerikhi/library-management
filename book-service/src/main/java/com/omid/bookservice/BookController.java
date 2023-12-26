package com.omid.bookservice;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.LifecycleState;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping
    public List<Book> getAll(){
        return bookService.findAllBook();
    }

    @GetMapping("/{id}")
    public Book findOne(@PathVariable("id") Integer id){
        return bookService.findOneBook(id);
    }

    @PostMapping
    public Book create(@RequestBody Book book){
        return bookService.createBook(book);
    }

    @PutMapping("/{id}")
    public Book update(@PathVariable("id") Integer id, @RequestBody Book book){
        return bookService.updateBook(id,book);
    }

    @GetMapping("/search")
    public List<Book>  search(@RequestParam("keyword") String keyword){
        return bookService.search(keyword);
    }
}
