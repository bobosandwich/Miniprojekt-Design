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
    
    public Copy findCopy(int serialNumber){
    return CopyContainer.getInstance().findCopy(serialNumber);  
    }
    
}
