package Part2;

/*reference book class
 * this book has only title and borrowedDay
 * the book is extending Libbook and implements Book directly from Libbook itself
 * it should contains getTitle,getBorrowDuration and Compute fine which are an abstract methods from Libbook 
 */
public class ref_book extends Libbook {

    //constructor
    int Borrowduration = 2;
    public ref_book(String title, int borrowedDay) {
        super(title, borrowedDay);
    }

    
    
    @Override
    //get titles
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    //Borrow duration which is neccessary to calculate fine
    public int getBorrowDuration() {
        return Borrowduration;
    }
    
    //calculate fine if overdue
    @Override
    public int computeFine(int CurrentDay) {
        int daysOverdue = daysOverdue(CurrentDay);
        if (daysOverdue > 0 ){
            return 50 * daysOverdue;
        }
        else{
            return 0;
        }
    }

    
    
} 

