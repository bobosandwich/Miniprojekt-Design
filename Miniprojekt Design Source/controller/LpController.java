package controller;
import model.*;
import java.util.ArrayList;


/**
 * Lav en beskrivelse af klassen LpController her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class LpController
{
    
    public void addLp(int barcode, String title, String artist, String publication){
        Lp lp = new Lp(barcode, title, artist, publication);
        LpContainer.getInstance().addLp(lp);
    }
    
    public void addCopyToLp(int barcode, int serialNumber, String purchaseDate, int purchasePrice){
        LpContainer.getInstance().AddCopyToLp(barcode, serialNumber, purchaseDate,purchasePrice);
    }
    
    public void findlp(int barcode){
        Lp lp = LpContainer.getInstance().findLp(barcode);
        System.out.print(lp);
    }
    
    public Copy findGoThroughLpContainer(int serialNumber){
        return LpContainer.getInstance().findCopy(serialNumber);
    }
    
}
