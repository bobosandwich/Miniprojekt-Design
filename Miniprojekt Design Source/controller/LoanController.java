package controller;
import model.*;

/**
 * Write a description of class FriendController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanController {
    private FriendController FriendController;
    private CopyController Copycontroller;
    private Friend currentFriend = null;
    private Copy currentCopy = null;

    public LoanController(){
        FriendController = new FriendController();
        Copycontroller = new CopyController();

    }

    public Friend addFriendToLoan(String name){
        currentFriend = FriendController.findFriend(name);
        return currentFriend;

    }

    public Copy addCopyToLoan(int serialNumber){
        currentCopy = Copycontroller.findCopy(serialNumber);
        return currentCopy;
    }

    public void addLoan(String loanNumber, String borrowDate, String endDate){
        Loan newLoan = new Loan(loanNumber, borrowDate, endDate, currentCopy, currentFriend);
        LoanContainer.getInstance().addLoan(newLoan);

    }

    public String getReturnedDate(String loanNumber){
        if(LoanContainer.getInstance().findReturnedDate(loanNumber) != null){

        }
        return LoanContainer.getInstance().findReturnedDate(loanNumber);
    }

    public void returned(String loanNumber, String date){
        LoanContainer.getInstance().findLoanNumber(loanNumber, date);

    }
}
