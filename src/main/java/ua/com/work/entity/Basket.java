package ua.com.work.entity;

import javax.persistence.*;

/**
 * Created by Solomiya on 03.10.2017.
 */
@Entity
public class Basket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne ( fetch = FetchType.LAZY)
    private  Book book;

    public Basket() {
    }

    public Basket(Book book) {
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
