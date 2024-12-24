package com.nab.contro.mapper;

import com.nab.contro.dao.entities.Book;
import com.nab.contro.dto.BookDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


@Component
public class BookMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public BookDTO toDTO(Book book) {
        return modelMapper.map(book, BookDTO.class);
    }

    public Book toEntity(BookDTO bookDTO) {
        return modelMapper.map(bookDTO, Book.class);
    }
}
