package model;
import java.util.ArrayList;


/**
 * Write a description of class Lp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lp
{
    private int barCode;
    private String title;
    private String artist;
    private String publicationDate;
    private ArrayList<Copy> currentCopyCollection;

    
    public Lp(int barCode, String title, String artist, String publicationDate)
    {
        this.barCode = barCode;
        this.title = title;
        this.artist = artist;
        this.publicationDate = publicationDate;
        currentCopyCollection = new ArrayList();
    }
    
    public int getBarCode(){
        return barCode;
    }
    
    public ArrayList getCollection(){
        return currentCopyCollection;
    }
    
    
    public void addCopy(int serialNumber, String purchaseDate, int purchasePrice){
        Copy copy = new Copy(serialNumber, purchaseDate, purchasePrice);
        currentCopyCollection.add(copy);
    }

    
}
