package Part2;

public class TestBook {
    public static void main(String[] args) {
        audio_book AUB = new audio_book("the java kingdom", 0, "someone");
        ref_book refB = new ref_book("the poor father and the rich father", 12);
        regular_book B = new regular_book("Bobby fischer teaches chess",15,"bobby fischer");
        Libbook Bookk = new audio_book("hello",15,"world");

        System.out.println("Test for reference book:");
        System.out.println("this is the 20th day after borrowing");
        System.out.println("you have to pay  " + refB.computeFine(20));
        System.out.println("name_of the book is  " + refB.getTitle());
        
        //casting example
        //we want to get the author name on the Book which is a Libbook
        // Bookk.getAuthor(); will never work such that getAuthor is not diffined on Libbook

        System.out.println(((audio_book) Bookk).getAuthor());


        //other casting tests

        //not possible between subclasses regular_book RB_AB =(ref_book) refB;

        //not possible too audio_book A_LB = (Libbook) AUB;
        Libbook Book_t = new ref_book("al", 14);
        Libbook B_A = (ref_book) Book_t;

        Libbook Book_c = new regular_book("name", 4, null);
        Libbook B_reg = (regular_book) Book_c;

    
    }
}
