package com.nab.contro;

import com.nab.contro.dao.entities.Book;
import com.nab.contro.dao.repositories.BookRepository;
import com.nab.contro.dto.BookDTO;
import com.nab.contro.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class ControApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BookRepository bookRepository) {
        return args -> {
            bookRepository.save(
                    Book.builder()
                            .title("Spring Boot")
                            .publisher("NAB")
                            .datePublication(new Date())
                            .price(30)
                            .resume("Spring Boot is a framework that allows you to build stand-alone, production-grade Spring based Applications")
                            .build()
            );
        };
    }
}
