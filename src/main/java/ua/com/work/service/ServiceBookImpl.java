package ua.com.work.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.work.dao.DaoBook;
import ua.com.work.entity.Book;

import java.util.List;

/**
 * Created by Solomiya on 03.10.2017.
 */
@Service
public class ServiceBookImpl implements ServiceBook {
    @Autowired
    DaoBook daoBook;

    @Override
    public void save(Book book) {
        daoBook.save(book);
    }

    @Override
    public List<Book> findAll() {
        return daoBook.findALLbook();
    }


    @Override
    public void deleteById(int id) {
        daoBook.delete(id);
    }

    @Override
    public Book findById(int id) {
        return daoBook.findOne(id);
    }
}
