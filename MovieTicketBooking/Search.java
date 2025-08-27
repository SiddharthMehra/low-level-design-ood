package MovieTicketBooking;

import java.util.List;

public interface Search {

    List<Movie> searchByTitle(String title);
    List<Movie> searchBySubject(String title);
    List<Movie> searchByAuthor(String title);
    List<Movie> searchByLanguage(String title);
    List<Movie> searchByGenre(String title);
}
