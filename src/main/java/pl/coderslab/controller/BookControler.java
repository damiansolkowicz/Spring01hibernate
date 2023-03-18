package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.dao.BookDao;
import pl.coderslab.entity.Book;

@Controller
public class BookControler {
    private BookDao bookDao;

 public BookControler(BookDao bookDao){
     this.bookDao=bookDao;
 }

    @RequestMapping(value = "/book/add", produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String addBook() {
        Book book=new Book();
        book.setTitle("title");
        book.setDescription("description");
        book.setRating(33);
        bookDao.saveBook(book);
        return "Id dodanej książki to:"
                + book.getId();
    }
    @RequestMapping("/book/get/{id}")
    @ResponseBody
    public String getBook(@PathVariable long id) {
        Book book = bookDao.findById(id);
        return book.toString();
    }
    @RequestMapping("/book/update/{id}/{title}")
    @ResponseBody
    public String updateBook(@PathVariable long id, @PathVariable String title ) {
        Book book = bookDao.findById(id);
        book.setTitle(title);
        bookDao.update(book);
        return book.toString();
    }
    @RequestMapping("/book/delete/{id}")
    @ResponseBody
    public String deleteBook(@PathVariable long id) {
        Book book = bookDao.findById(id);
        bookDao.delete(book);
        return "deleted";
    }
}
