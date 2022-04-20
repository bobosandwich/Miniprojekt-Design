package model;
import java.util.ArrayList;


/**
 * Write a description of class LoanContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanContainer {
    private static LoanContainer instance;
    private ArrayList<Loan> loans;
    /**
     * Constructor for objects of class StudentContainer
     */
    private LoanContainer() {
        // initialise instance variables
        loans = new ArrayList<>();
    }
    
    public static LoanContainer getInstance() {
        if (instance == null) {
            instance = new LoanContainer();
        }
        return instance;
    }
    
    public void addLoan(Loan loan){
        loans.add(loan);
    }
}
