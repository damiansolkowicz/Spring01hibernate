package pl.coderslab.service.impl;

import org.springframework.stereotype.Service;
import pl.coderslab.dao.AuthorDao;
import pl.coderslab.dao.PublisherDao;
import pl.coderslab.entity.Author;
import pl.coderslab.entity.Publisher;
import pl.coderslab.service.PublisherService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;


@Service
@Transactional
public class PublisherServiceImpl implements PublisherService {

    private final PublisherDao publisherDao;

    public PublisherServiceImpl(PublisherDao publisherDao) {
        this.publisherDao = publisherDao;
    }

    @Override
    public void save(Publisher publisher) {
        publisherDao.save(publisher);
    }

    @Override
    public void update(Publisher publisher) {
        publisherDao.update(publisher);
    }

    @Override
    public Publisher findById(Long id) {
        return publisherDao.findById(id);
    }

    @Override
    public List<Publisher> findAll() {
        return publisherDao.findAll();
    }

    @Override
    public List<pl.coderslab.model.Publisher> findAllPublisherModel(){

        final List<Publisher> publishers = publisherDao.findAll();
//        publishers
//                .stream()
//                .map(publisherEntity -> {
//                    pl.coderslab.model.Publisher publisher = new pl.coderslab.model.Publisher();
//                    publisher.setId(publisherEntity.getId());
//                    publisher.setName(publisherEntity.getName());
//                })
//                .collect(Collectors.toList());
//
//        return publishers;
        return null;
    }

    @Override
    public void deleteById(Long id) {
        publisherDao.deleteById(id);
    }

}