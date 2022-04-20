package model;

/**
 * Write a description of class Loan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loan
{
    // instance variables - replace the example below with your own
    private String loanNumber;
    private String borrowDate;
    private String endDate;
    private String returnedDate;

    /**
     * Constructor for objects of class Loan
     */
    public Loan(String loanNumber, String borrowDate, String endDate)
    {
        this.loanNumber = loanNumber;
        this.borrowDate = borrowDate;
        this.endDate = endDate;
    }

    public void setReturnedDate(String date){
        this.returnedDate = date;    
    }

    public void getReturnedDate(){
        if(returnedDate != null){
            System.out.println("Copy is returned " + returnedDate);
        }
        
        else{
            System.out.println("Copy is not returned yet");
        }
    }
}
