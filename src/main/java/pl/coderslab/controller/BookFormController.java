
package pl.coderslab.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.model.Book;
import pl.coderslab.model.Publisher;
import pl.coderslab.service.BookService;
import pl.coderslab.service.PublisherService;

@Controller
@RequiredArgsConstructor
public class BookFormController {

    private final BookService bookService;
    private final PublisherService publisherService;

    @GetMapping(path="/book/form")
    String showAddBookForm(Model model){
        model.addAttribute("book", new Book());
        return "book/add";
    }

    @PostMapping(path="/book/form")
    String processAddBook(Book book){
        bookService.save(book);
        return "book/success";
    }


}