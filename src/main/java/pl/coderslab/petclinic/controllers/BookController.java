package pl.coderslab.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.petclinic.repositories.BookRepository;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/all")
    public String getBooks (Model model){
        model.addAttribute("books", bookRepository.findAll());
        return "books/list";
    }
}
