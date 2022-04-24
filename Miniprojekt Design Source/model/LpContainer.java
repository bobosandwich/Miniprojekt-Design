package model;
import java.util.ArrayList;


/**
 * Write a description of class LpContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LpContainer
{
    private static LpContainer instance;
    private ArrayList<Lp> lps;
    /**
     * Constructor for objects of class StudentContainer
     */
    private LpContainer() {
        lps = new ArrayList<>();
    }
    
    public static LpContainer getInstance() {
        if (instance == null) {
            instance = new LpContainer();
        }
        return instance;
    }
    
    public void addLp(Lp lp){
        lps.add(lp);
    }
    
    public Lp findLp(int BarCode){
        boolean found = false;
        int index = 0;
        Lp tempLp = null;
        while(index < lps.size() && !found){
            if(lps.get(index).getBarCode() == BarCode){
                tempLp = lps.get(index);
                found = true;
            }
            
            if(tempLp== null){
                index++;
            }
        }
        
        return tempLp;
}

public Copy findCopy(int serialNumber){
    Copy tempCopy = null;
    boolean found = false;
    int index = 0;
    while(index < lps.size() && !found){
        tempCopy = lps.get(index).findCopy(serialNumber);
        if(tempCopy != null){
            found = true;
        } else{
            index++;
        }
    }
    return tempCopy;
}


public void AddCopyToLp(int barcode, int serialNumber, String purchaseDate, int purchasePrice){
    Lp lp = null;
    lp = findLp(barcode);
    lp.addCopy(serialNumber, purchaseDate, purchasePrice);
}

}
