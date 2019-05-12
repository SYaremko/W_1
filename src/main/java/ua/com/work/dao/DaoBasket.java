package ua.com.work.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ua.com.work.entity.Basket;
import ua.com.work.entity.Book;

import java.util.List;

/**
 * Created by Solomiya on 03.10.2017.
 */
public interface DaoBasket extends JpaRepository<Basket, Integer> {

    @Query("from Basket b join fetch b.book")
    List <Basket> fetchBook();
}
