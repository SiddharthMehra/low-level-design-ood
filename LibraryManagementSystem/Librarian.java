package LibraryManagementSystem;

public class Librarian extends User{

    public boolean addBookItem(BookItem bookItem);
    public boolean blockMember(Member member);
    public boolean addMember(Member member);
    public boolean resetPassword() {return false;}

}
