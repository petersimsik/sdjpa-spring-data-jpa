package guru.springframework.jdbc.dao;

import guru.springframework.jdbc.domain.Book;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface BookDao {
    Book getById(Long id);
    Book saveNewBook(Book book);
    Book updateBook(Book book);
    void deleteBookById(Long id);
    Book findBookByTitle(String title);

    List<Book> findAllBooksSortByTitle(Pageable pageable);

    List<Book> findAllBooks(Pageable pageable);
    List<Book> findAllBooks(int pageSize, int offset);

    List<Book> findAllBooks();
}
