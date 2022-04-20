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
    private Loan loan;

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

    public String findReturnedDate(String loanNumber){
        String returnedDate = "";
        int index = 0;
        boolean found = false;

        while(index < loans.size() && !found){
            Loan loan = loans.get(index);
            if(loan.getLoanNumber().equals(loanNumber)){
                returnedDate = loan.getReturnedDate();
                found = true;}

            else{
                index++;
            }
        }
        if(found){
            return returnedDate;
        }
        else{
            return null;
        }
    }

    public void findLoanNumber(String loanNumber, String date){

        int index = 0;
        boolean found = false;

        while(index < loans.size() && !found){
            Loan loan = loans.get(index);
            if(loan.getLoanNumber().equals(loanNumber)){
                loan.setReturnedDate(date);
                found = true;}

            else{
                index++;
            }
        }

    }

    
}

