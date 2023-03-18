package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.dao.AuthorDao;
import pl.coderslab.dao.BookDao;
import pl.coderslab.entity.Author;
import pl.coderslab.entity.Book;

@Controller
public class AuthorControler {
    private AuthorDao authorDao;

 public AuthorControler(AuthorDao authorDao){
     this.authorDao=authorDao;
 }

    @RequestMapping(value = "/author/add", produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String hello() {
        Author author=new Author();
        author.setFirstName("firstName");
        author.setLastName("Nwak");
        authorDao.saveAuthor(author);
        return "Id autora książki to:"
                + author.getId();
    }
    @RequestMapping("/author/get/{id}")
    @ResponseBody
    public String getAuthor(@PathVariable long id) {
        Author author=authorDao.findById(id);
        return author.toString();
    }
    @RequestMapping("/author/update/{id}/{firstName}")
    @ResponseBody
    public String updateBook(@PathVariable long id, @PathVariable String firstName ) {
        Author author=authorDao.findById(id);
        author.setFirstName("nowak");
        authorDao.update(author);
        return author.toString();
    }
    @RequestMapping("/author/delete/{id}")
    @ResponseBody
    public String authorDelete(@PathVariable long id) {
        Author author=authorDao.findById(id);
        authorDao.delete(author);
        return "deleted";
    }
}
