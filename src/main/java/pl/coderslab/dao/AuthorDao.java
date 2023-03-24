package pl.coderslab.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.entity.Author;
import pl.coderslab.entity.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class AuthorDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Author author) {
        entityManager.persist(author);
    }

    public void update(Author author) {
        entityManager.merge(author);
    }

    public Author findById(Long id) {
        return entityManager.find(Author.class, id);
    }

    public void deleteById(long id) {
        Author author = entityManager.find(Author.class, id);
        entityManager.remove(entityManager.contains(author) ? author : entityManager.merge(author));
    }
    public List<Author> findAll() {
        Query query = entityManager.createQuery("select a from  Author  a");
        return query.getResultList();
    }
}