package ua.com.work.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ua.com.work.entity.Basket;
import ua.com.work.entity.Book;
import ua.com.work.service.ServiceBasket;
import ua.com.work.service.ServiceBook;

import javax.validation.Valid;
import java.util.List;


@Controller
public class Main {
    @Autowired
    private ServiceBook serviceBook;
    @Autowired
    private ServiceBasket serviceBasket;

    @RequestMapping("/")
    public String show(Model model){
        List<Book> books = serviceBook.findAll();
        model.addAttribute("showBook",books);
        List<Basket> baskets = serviceBasket.fetchBook();
        model.addAttribute("baskets", baskets);
        return "index";

    }

    @PostMapping("/add")
    public String addBook(@RequestParam("name") String name,
                          @RequestParam("author") String author) {

        Book book = new Book();
        book.setName(name);
        book.setAuthor(author);
        serviceBook.save(book);

        return "redirect:/";
    }

    @RequestMapping("/deleteBook-{id}")
    public String deleteBook(@PathVariable int id){
        serviceBook.deleteById(id);

        return "redirect:/";
    }
    @GetMapping("/editBook-{id}")
    public String editBook(@PathVariable int id,
                               Model model) {


        Book books = serviceBook.findById(id);
        model.addAttribute("editBook", books);

        return "editBook";
    }
    @PostMapping("/editBook-{id}")
    public String updateBook(@Valid Book book, BindingResult result, @PathVariable int id) {
        if (result.hasErrors()) {
            return "editBook";
        }
       serviceBook.save(book);

        return "redirect:/";
    }

    @GetMapping("/addTobasket-{id}")
    public String addTOBasket(@PathVariable ("id") int id) {
        Book byId = serviceBook.findById(id);
        Basket basket = new Basket();
         basket.setBook(byId);
        serviceBasket.saveOneBasket(basket);
        return "redirect:/";
    }
}
