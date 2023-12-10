package Part2;

/*regular book class
 * this book has author title and borrowedDay
 * the book is extending Libbook and implements Book directly from Libbook itself
 * it should contains getTitle,getBorrowDuration and Compute fine which are an abstract methods from Libbook 
 */

public class regular_book extends Libbook {

    String author;
    int borrowDuration = 14;
    public regular_book(String title, int borrowedDay,String author) {
        super(title, borrowedDay);
        this.author = author;
    }

    // the Borrowdays which is neccessary to calculate the fine if overdue happend
    @Override
    public int getBorrowDuration() {
        return borrowDuration; // 2weeks *7 days
    }

    // Computing the fine if overdue
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
    
    // Setters and Getters
    @Override
    public String getTitle() {
        return super.getTitle();
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    
} 