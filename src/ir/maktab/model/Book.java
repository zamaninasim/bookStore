package ir.maktab.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private String authorName;
    private String ISBN;
    private String bookTitle;
    private Integer publishedYear;
    private Long price;
    private Integer soldNumber;
    private Long soldTotalPrice;

    public Book(String authorName, String ISBN, String bookTitle, Integer publishedYear, Long price, Integer soldNumber) {
        this.authorName = authorName;
        this.ISBN = ISBN;
        this.bookTitle = bookTitle;
        this.publishedYear = publishedYear;
        this.price = price;
        this.soldNumber = soldNumber;
        this.soldTotalPrice = this.price * this.soldNumber;
    }
}
