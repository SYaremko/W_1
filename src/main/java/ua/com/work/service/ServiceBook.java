package ua.com.work.service;

import ua.com.work.entity.Book;

import java.util.List;

/**
 * Created by Solomiya on 03.10.2017.
 */
public interface ServiceBook {

    void save(Book book);

    List<Book> findAll();

    void deleteById(int id);

    Book findById(int id);

   /* public void remove(String name);*/
}
