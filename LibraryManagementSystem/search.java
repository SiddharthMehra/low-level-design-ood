package LibraryManagementSystem;

import java.util.Date;
import java.util.List;

public interface search {

    public List<Book> searchByTitle(String title);
    public List<Book> searchByAuthor(String author);
    public List<Book> searchBySubject(String subject);
    public List<Book> searchByDate(Date publishedAt);


}
