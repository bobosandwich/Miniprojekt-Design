package controller;

import model.*;
// Hello World
/**

 * @author (fen - kbha) 
 * @version (2016.10.04, 2019.10.16)
 */
public class CDController{
    private CDCollection cdCont;

    public CDController(){
        // initialise instance variables
        //cdCont = new CDCollection();
        cdCont = CDCollection.getInstance();
    }
    
    public CD findCD(String title){
        return cdCont.findCD(title);
    }
    
    public void createCD(int no, String title){
        CD cdObj = new CD(no, title);
        cdCont.addCD(cdObj);
    }
    
    public void addTrack(String title, String track, int length){
        // find the cd
        CD cdObj = cdCont.findCD(title);
        if(cdObj != null){
            cdObj.addTrack(track, length);
        }
    }
}
