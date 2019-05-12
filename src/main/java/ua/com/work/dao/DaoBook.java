package ua.com.work.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.com.work.entity.Book;

import java.util.List;

/**
 * Created by Solomiya on 03.10.2017.
 */
public interface DaoBook extends JpaRepository<Book, Integer> {

    @Query("from Book b ORDER BY name " )
    List<Book> findALLbook();




}
