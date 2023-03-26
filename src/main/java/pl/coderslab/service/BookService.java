
package pl.coderslab.service;

import pl.coderslab.entity.Author;
import pl.coderslab.entity.Book;
import pl.coderslab.entity.Publisher;

import java.util.List;

public interface BookService {

     public void save(Book book);

     public void save(pl.coderslab.model.Book book);

     List<Book> findByAuthor(Author author);

     public void update(Book book);

     public Book findById(Long id);

     public List<Book> findAll();

     public List<Book> findByRating(int rating);

     public List<Book> findNotEmptyPublisher();

     List<Book> findAllByRating(int rating);

     List<Book> findByPublisherIsNotNull();

     public List<Book> findByPublisher(Publisher publisher);

     public void deleteById(Long id);

}