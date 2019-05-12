package ua.com.work.service;

import ua.com.work.entity.Basket;
import ua.com.work.entity.Book;

import java.util.List;

/**
 * Created by Solomiya on 03.10.2017.
 */
public interface ServiceBasket {

    void saveOneBasket(Basket basket);

    List<Basket> fetchBook();
}
