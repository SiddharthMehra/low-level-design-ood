package LibraryManagementSystem;

import java.util.Date;

public class Member extends User {
         private Date dateofMembership;
         private int numBooksCheckedOut;

         public boolean reserveBookItem(BookItem bookItem);
         private void incementTotalBooksCheckout(numBooksCheckedOut);
         private boolean checkoutBookItem(BookItem bookItem);
         private void checkForFine(String bookId);
         public void returnBookItem(BookItem bookItem);

         public boolean resetPassword() {
             return false;
         }

}
