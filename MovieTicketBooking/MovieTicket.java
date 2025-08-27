package MovieTicketBooking;

public class MovieTicket {
    public int ticketId;
    public Movie movie;
    public Seat seat;
    public ShowTime show;

    public MovieTicket(int ticketId, Movie movie, Seat seat, ShowTime show) {
        this.ticketId = ticketId;
        this.movie = movie;
        this.seat = seat;
        this.show = show;
    }
}
