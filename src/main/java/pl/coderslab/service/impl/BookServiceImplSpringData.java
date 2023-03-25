
package pl.coderslab.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.dao.BookDao;
import pl.coderslab.entity.Author;
import pl.coderslab.entity.Book;
import pl.coderslab.entity.Publisher;
import pl.coderslab.repository.BookRepository;
import pl.coderslab.service.AuthorService;
import pl.coderslab.service.BookService;
import pl.coderslab.service.PublisherService;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BookServiceImplSpringData implements BookService {

    private final BookRepository bookRepository;
    private final PublisherService publisherService;
    private final AuthorService authorService;



    @Override
    public void save(Book book) {
        final Publisher publisher = book.getPublisher();
        publisherService.save(publisher);

        List<Author> authors = new ArrayList<>();
        authors.add(authorService.findById(1L));
        authors.add(authorService.findById(2L));
        book.setAuthors(authors);

        bookDao.save(book);
    }

    @Override
    public void save(pl.coderslab.model.Book book){
        Book bookEntity = new Book();
        bookEntity.setTitle(book.getTitle());
        bookEntity.setDescription(book.getDescription());
        bookEntity.setRating(book.getRating());



        bookDao.save(bookEntity);
    }

    @Override
    public void update(Book book) {
        bookDao.update(book);
    }

    @Override
    public Book findById(Long id) {
        return bookDao.findById(id);
    }

    @Override
    public List<Book> findAll(){
        return bookDao.findAll();
    }

    @Override
    public List<Book> findByRating(int rating) {
        return bookDao.findByRating(rating);
    }

    @Override
    public List<Book> findNotEmptyPublisher(){
        return bookDao.findByPublisherIsNotNull();
    }

    @Override
    public List<Book> findByPublisher(Publisher publisher){
        return bookDao.findByPublisher(publisher);
    }
    @Override
    public void deleteById(Long id) {
        bookDao.deleteById(id);
    }

}