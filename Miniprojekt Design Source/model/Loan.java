package model;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

/**
 * Write a description of class Loan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loan
{
    // instance variables - replace the example below with your own
    private static String StaticloanNumber = "0";
    private String loanNumber;
    private String borrowDate;
    private String endDate;
    private String returnedDate;
    private Copy copy;
    private Friend friend;

    /**
     * Constructor for objects of class Loan
     */
    public Loan(Copy copy, Friend friend)
    {
        loanNumber = null;
        borrowDate = null;
        endDate = null;
        this.returnedDate = null;
        this.copy = copy;
        this.friend = friend;
    }

    public void setReturnedDate(String date){
        this.returnedDate = date;    
    }

    public String getReturnedDate(){
        return returnedDate;
    }
    
    public String getLoanNumber(){
        return loanNumber;
    }
    
    public void AutoGenerateData(){
        GenereateLoanNumber();
        GenereateBorrowDateAndEndDate();
    }
    
    public void GenereateLoanNumber(){
        int intLoanNumber = Integer.parseInt(StaticloanNumber);
        intLoanNumber = intLoanNumber + 1;
        loanNumber = Integer.toString(intLoanNumber);
        StaticloanNumber = Integer.toString(intLoanNumber);
    }
    
    public void GenereateBorrowDateAndEndDate(){
        LocalDate d1 = LocalDate.now();
        borrowDate = d1.format(DateTimeFormatter.ISO_DATE);
        
        LocalDate d2 = d1.plusDays(30);
        endDate = d2.format(DateTimeFormatter.ISO_DATE);
    
    }
    
    
}
