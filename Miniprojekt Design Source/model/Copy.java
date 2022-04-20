package model;


/**
 * Write a description of class Copy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Copy
{
    // instance variables - replace the example below with your own
    private int serialNumber;
    private String purchaseDate;
    private int purchasePrice;

    /**
     * Constructor for objects of class Copy
     */
    public Copy(int serialNumber, String purchaseDate, int purchasePrice)
    {
        // initialise instance variables
        this.serialNumber = serialNumber;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
    }

    public int getSerialNumber(){
        return serialNumber;
    }
    
}
