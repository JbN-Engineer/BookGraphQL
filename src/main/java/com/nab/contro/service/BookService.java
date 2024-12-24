package com.nab.contro.service;


import com.nab.contro.dto.BookDTO;

import java.util.List;

public interface BookService {
    List<BookDTO> findByTitle(String title);
    BookDTO saveBook(BookDTO bookDTO);
}
