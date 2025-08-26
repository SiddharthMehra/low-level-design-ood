package LibraryManagementSystem;

public abstract class Book {

    private String isbn;
    private String title;
    private String publisher;
    private String language;
    private String subject;
    private int numPages;
    private BookFormat bookFormat;
    private List<Author> authors;
}
