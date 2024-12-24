package com.nab.contro.web;

import com.nab.contro.dto.BookDTO;
import com.nab.contro.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookGraphQLController {

    @Autowired
    private BookService bookService;

    @QueryMapping
    public List<BookDTO> getBookByTitle(@Argument String title) {
        return bookService.findByTitle(title);
    }

    @MutationMapping
    public BookDTO saveBook(@Argument BookDTO book) {
        return bookService.saveBook(book);
    }
}

