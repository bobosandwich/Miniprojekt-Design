package model;
import java.util.ArrayList;

/**
 * Write a description of class CopyContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CopyContainer {
    private static CopyContainer instance;
    private ArrayList<Copy> copies;
    /**
     * Constructor for objects of class StudentContainer
     */
    private CopyContainer() {
        copies = new ArrayList<>();
    }
    
    public static CopyContainer getInstance() {
        if (instance == null) {
            instance = new CopyContainer();
        }
        return instance;
    }
    
    public void addCopy(Copy copy){
        copies.add(copy);
    }
    
    public Copy findCopy (int serialNumber){
        int index = 0;
        boolean found = false;

        while(index < copies.size() && !found){
            Copy copy = copies.get(index);
            if(copy.getSerialNumber()==(serialNumber)){
                found = true;}

            else{
                index++;
            }
        }
        if(found){
            return copies.get(index);
        }
        else{
            return null;
        }
    }
}

