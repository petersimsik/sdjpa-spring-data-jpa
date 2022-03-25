package guru.springframework.jdbc.dao;

import guru.springframework.jdbc.domain.Book;

import java.util.Optional;

public interface BookDao {
    Book getById(Long id);
    Book saveNewBook(Book book);
    Book updateBook(Book book);
    void deleteBookById(Long id);
    Book findBookByTitle(String title);
}
