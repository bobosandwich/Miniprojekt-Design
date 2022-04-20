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
        // initialise instance variables
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
    
    //public void findCopy(int serialNumber){
}
