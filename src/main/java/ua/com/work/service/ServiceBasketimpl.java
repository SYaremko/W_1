package ua.com.work.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.work.dao.DaoBasket;
import ua.com.work.entity.Basket;

import java.util.List;

/**
 * Created by Solomiya on 03.10.2017.
 */
@Service
public class ServiceBasketimpl implements ServiceBasket{
    @Autowired
    private DaoBasket daoBasket;

    @Override
    public void saveOneBasket(Basket basket) {
        daoBasket.save(basket);
    }

    @Override
    public List<Basket> fetchBook() {
        return daoBasket.fetchBook();
    }
}
