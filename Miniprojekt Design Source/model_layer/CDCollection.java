package model_layer;

import java.util.ArrayList;    
import java.util.Iterator;
/**
 * Collection of CDs
 * 
 * @author (FEN, KBH, MARS, KBHA) 
 * @version (2003.10.27, 2005.02.23, 2005.09.20, 2009.09.29,
 *           2012.04.10, 2019.10.16)
 */


public class CDCollection{
    private ArrayList<CD> myCDCollection;
    private static CDCollection instance;
    
    /**
     * Constructor for objects of class CDCollection
     * implemented as a singelton
     * (Note: The constructor is private
     */
    private CDCollection(){
        myCDCollection = new ArrayList<CD>();
      
    }
    // Singleton 
    public static CDCollection getInstance(){
        if(instance == null){
            instance = new CDCollection();
        }
        return instance;
    }
    
    public void addCD(CD cd){
        myCDCollection.add(cd);
    }
    
    //print all cd's in the collection
    //Shouldn't be in the model
    //Should return a list and printing should be done in the UI layer
    //Exercise: FIX IT!!!:-)
    public void printCD() {
        System.out.println("List of CD titles");
        for (CD cd : myCDCollection){
            System.out.println(cd.getTitle());
        }
    }
    
    //no printing here - instead error handling in UI
    public void removeCD(String titel){
        CD cd = findCD(titel); 
        if(cd != null){
            boolean ok = myCDCollection.remove(cd); //remove an object
            if(ok){
                System.out.println("Cd with title " + titel + "has been removed");
            }
            else{
                System.out.println("Removal failed");
            }
        }
        else{ 
            System.out.println("No CD called" + titel + " within the collection");
        }
    }
    
    public CD findCD(String title){
        CD cd = null;      //initalisering
        int index = 0;     //initialisering
        boolean found = false; //initialisering
        while(index < myCDCollection.size() && !found){
            //as long as there are more unvisited 
            //elements and we din't find the element
            cd = myCDCollection.get(index); //get the next element
            if(cd.getTitle().equals(title)){ // is it the rigth one?
                found = true;
            }
            else{
                 index++;  //remove from unvisited
                }
         } // end while
        if (found){
            return myCDCollection.get(index);
        }
        else{   
         return null;
        }
       
    }
    
    
    public int findAllTracksLongerThan4(){
        int number = 0;
        for (CD cd : myCDCollection){
            number = number + cd.tracksLongerThan(4);
        }
        return number;
    }
    
    //returning all tracks longer than 4 minutes
    public ArrayList<Track> findAllTracksLonger(){
        ArrayList<Track> allTracks = new ArrayList<Track>();
        for(CD cd : myCDCollection){
            allTracks.addAll(allTracks.size(), cd.getTrackLongerThan(4));
        }
        return allTracks;
    }
    

     public double getAverageTime(){
        double average =0;
        int number = myCDCollection.size();
        int totalTime = 0;
        Iterator<CD> it = myCDCollection.iterator();
        while(it.hasNext()){  
            CD myCD = it.next(); 
            totalTime =  totalTime + myCD.totalPlaybackTime();
        }
        if( number > 0){
           average = totalTime / number;
        }    
        return average;
     }
     
   
}
