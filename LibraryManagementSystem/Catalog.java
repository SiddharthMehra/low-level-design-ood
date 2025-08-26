package LibraryManagementSystem;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Catalog implements search {

    private HashMap<String, List<Book>> bookTitles;
    private HashMap<String, List<Book>> bookAuthors;
    private HashMap<String, List<Book>> bookSubjects;
    private HashMap<String, List<Book>> booksPublishingDate;

    public List<Book> searchByTitle(String query) {
        return null;
    }

    public List<Book> searchByAuthor(String query) {

        return null;

    }

    public List<Book> searchBySubject(String query) {
        return null;
    }

    public List<Book> searchByDate(Date publisehdAt) {
        return null;
    }
}
