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
    private ArrayList<Lp> Lps;
    /**
     * Constructor for objects of class StudentContainer
     */
    private LpContainer() {
        Lps = new ArrayList<>();
    }
    
    public static LpContainer getInstance() {
        if (instance == null) {
            instance = new LpContainer();
        }
        return instance;
    }
    
    public void addLp(Lp lp){
        Lps.add(lp);
    }
    
    //public void findLp(int serialNumber){
}
