package pl.coderslab.service.impl;

import org.springframework.stereotype.Service;
import pl.coderslab.dao.PersonDao;
import pl.coderslab.dao.PersonDetailsDao;
import pl.coderslab.entity.Person;
import pl.coderslab.entity.PersonDetails;
import pl.coderslab.service.PersonDetailsService;

import javax.transaction.Transactional;

@Service
@Transactional
public class PersonDetailsServiceImpl implements PersonDetailsService {


    private final PersonDetailsDao personDetailsDao;

    public PersonDetailsServiceImpl(PersonDetailsDao personDetailsDao) {
        this.personDetailsDao = personDetailsDao;
    }

    @Override
    public void save(PersonDetails personDetails) {
        personDetailsDao.save(personDetails);
    }

    @Override
    public void update(PersonDetails personDetails) {
        personDetailsDao.update(personDetails);
    }

    @Override
    public PersonDetails findById(Long id) {
        return personDetailsDao.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        personDetailsDao.deleteById(id);
    }
}