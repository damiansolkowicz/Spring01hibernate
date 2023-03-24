package pl.coderslab.service.impl;

import org.springframework.stereotype.Service;
import pl.coderslab.dao.AuthorDao;
import pl.coderslab.dao.BookDao;
import pl.coderslab.entity.Author;
import pl.coderslab.entity.Book;
import pl.coderslab.service.AuthorService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService {

    private final AuthorDao authorDao;

    public AuthorServiceImpl(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @Override
    public void save(Author author) {
        authorDao.save(author);
    }

    @Override
    public void update(Author author) {
        authorDao.update(author);
    }

    @Override
    public Author findById(Long id) {
        return authorDao.findById(id);
    }

    @Override
    public List<Author> findAll(){
        return authorDao.findAll();
    }
    @Override
    public void deleteById(Long id) {
        authorDao.deleteById(id);
    }

}