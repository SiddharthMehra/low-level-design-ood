package MovieTicketBooking;

import java.util.ArrayList;
import java.util.Date;

public class Movie {

    public String title;
    public String genre;
    public Date releaseDate;
    public String language;
    public int duration;
    public List<ShowTime> shows = new ArrayList<>();

    public Movie(String title, String genre, Date releaseDate, String language, int duration) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.language = language;
        this.duration = duration;
    }


}
