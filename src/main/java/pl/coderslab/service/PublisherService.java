
package pl.coderslab.service;

import pl.coderslab.entity.Publisher;

import java.util.List;

public interface PublisherService {

    public void save(Publisher publisher);

    public void update(Publisher publisher);

    public Publisher findById(Long id);

    public List<Publisher> findAll();

    public List<pl.coderslab.model.Publisher> findAllPublisherModel();

    public void deleteById(Long id);
}