package MovieTicketBooking;

import java.util.HashMap;
import java.util.List;

public class Catalog implements Search{

    public HashMap<String, List<Movie>> movieTitles = new HashMap<>();
    public HashMap<String, List<Movie>> movieSubjects = new HashMap<>();
    public HashMap<String, List<Movie>> movieAuthors = new HashMap<>();
    public HashMap<String, List<Movie>> movieLanguages = new HashMap<>();
    public HashMap<String, List<Movie>> movieGenres = new HashMap<>();

    public List<Movie> searchByTitle(String title) {
        return null;
    }

    public List<Movie> searchBySubject(String subject) {
        return null;
    }

    public List<Movie> searchByAuthor(String author) {
        return null;
    }

    public List<Movie> searchByLanguage(String language) {
        return null;
    }

    public List<Movie> searchByGenre(String genre) {
        return null;
    }
}
