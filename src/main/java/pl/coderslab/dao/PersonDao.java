package pl.coderslab.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.entity.Book;
import pl.coderslab.entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PersonDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Person person) {
        entityManager.persist(person);
    }

    public void update(Person person) {
        entityManager.merge(person);
    }

    public Person findById(Long id){
        return entityManager.find(Person.class, id);
    }

    public void deleteById(Long id) {
        Person person = findById(id);
        entityManager.remove(entityManager.contains(person)? person: entityManager.merge(person));
    }
}