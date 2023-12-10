package Part2;

/*
 * Class audio_book which extends Libbook and implements automatically Book from Libbok class
 * this class should use must have title and borrowedDay because they are intialized on Libbook which is an abstract class
 * it should also have computeFine and getBorrowDuration shuch as they are an abstract methods because must have them as the system of the exercise work
 */
public class audio_book extends Libbook{
    String author; //the audio book have other
    int borrowing_date = 14;
    //constructor 
    public audio_book(String title, int borrowedDay,String author) {
        super(title, borrowedDay); // intializing borrowedday and title
        this.author = author; // intializing author
    }

    //getBorrowDuration must be set because each book has it own borrowDuration which is neccssary to calcualate the fee and others
    @Override
    public int getBorrowDuration() {
        return borrowing_date;
    }
    //computeFine is same as getBorrowDurration 
    //cacluating the fine if overdue happend
    @Override
    public int computeFine(int CurrentDay) {
        int daysOverdue = daysOverdue(CurrentDay);
        if (daysOverdue > 0 ){
            return 70 * daysOverdue;
        }
        else{
            return 0;
        }
    }
    //Setters and Getters
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
