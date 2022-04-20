package controller;
import model.*;


/**
 * Write a description of class CopyController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CopyController
{
    public void addCopy(String artist, int serialNumber, String purchaseDate, int purchasePrice){
        Copy newCopy = new Copy(artist, serialNumber, purchaseDate, purchasePrice);
        CopyContainer.getInstance().addCopy(newCopy);
        
    }
    
    public Copy findCopy(int serialNumber){
    return CopyContainer.getInstance().findCopy(serialNumber);  
    }
    
}
