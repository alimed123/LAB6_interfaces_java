package Part2;
/*using Libbook as an abstract because it have some parameters which should be shared with all type of books
 * such as title,borrowedDay,the borrowduration and the fine_compute if overdue
 * we didn't use daysOverdue as an abstract method because by calling isoverdue in other function we will calling directly and it's the same in all classes
 * 
 */
public abstract class Libbook implements Book{

    private String title; //defining prencipal variable to use later in other
    private int borrowedDay;
    
    public Libbook(String title,int borrowedDay){
        this.title = title;
        this.borrowedDay = borrowedDay;
    }
    // days overdue such that it calculate the 
    public int daysOverdue(int CurrentDay){
        int BorrowedDays = CurrentDay - borrowedDay;
        return BorrowedDays - getBorrowDuration();
    }
    public boolean isOverdue(int CurrentDay){
        
        return daysOverdue(CurrentDay) > 0;
    }

    public abstract int getBorrowDuration();

    public abstract int computeFine(int CurrentDay);

    @Override
    public  String getTitle() {
        return this.title;
    }
    }

