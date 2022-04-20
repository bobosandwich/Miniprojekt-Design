package controller;
import model.*;


/**
 * Write a description of class FriendController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanController {
    
    public void addLoan(String loanNumber, String borrowDate, String endDate){
        Loan newLoan = new Loan(loanNumber, borrowDate, endDate);
        LoanContainer.getInstance().addLoan(newLoan);
        
    }
}
    
