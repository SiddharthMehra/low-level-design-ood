package LibraryManagementSystem;

import java.util.Date;

public class BookItem {

    private String id;
    private boolean isReferenceOnly;
    private Date borrowed;
    private Date dueDate;
    private double price;
    private BookStatus bookStatus;
    private Date dateOfPurchase;
    private Date publicationDate;
    private Rack placedAt;
    private Book book;

    public boolean checkout(String memberId) {
        return true;
    }

    public void setPlacedAt(Rack rack) {
        this.placedAt = rack;
    }

    public void setAddedBy(Librarian librarian) {

    }

    public Book getBook() {
        return book;
    }
}
