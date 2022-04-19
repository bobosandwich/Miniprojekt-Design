package model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The CD class
 * 
 * @author (FEN, KBH, KBH, MARS) 
 * @version (2003.10.27, 2005.02.23, 2007.09.24, 2008.02.25, 2009.09.29)
 */

public class CD {
    private int id;
    private String title;
    private ArrayList<Track> tracks;

    /**
     * Constructor for objects of class CD
     */
    public CD(int id, String title){
        this.id= id;
        this.title= title;
        tracks= new ArrayList<Track>();
    }
    
    public int getId(){
        return id;
    }
    
    public int getTrackCount(){
        return tracks.size();
    }
    
    public String getTitle(){
        return title;
    }
    
    public void addTrack(String title, int length){
        Track track = new Track(title, length);
        tracks.add(track);
    }
    
    public void addTrack(Track newTrack){
        tracks.add(newTrack);
    }
    
    public ArrayList<Track> getTracks(){
        return tracks;
    }
    
    public Track getLongestTrack(){
        int length = 0;
        int storeIndex = 0;
        int index = 0;
        while(index < tracks.size()){
            Track nr = tracks.get(index); //get next element
            if(nr.getLength() > length){
                //do something with the element
                length = nr.getLength();
                storeIndex = index;
            }
            index++;                    //remove from not vistited
        }
        return tracks.get(storeIndex);
    }
    
    public int averageLength(){
        int totTime = 0;
        for(Track nr : tracks){
            totTime = totTime + nr.getLength();
        }
        if(tracks.size() > 0){
            return totTime /tracks.size();
        }
        else{
            return 0;
        }
    }
    
    public int tracksLongerThan(int tid){
       int numberOfTracks = 0;
       for(Track nr : tracks){
           if(nr.getLength() > tid){
               numberOfTracks++;
           }
       }
       return numberOfTracks;
    }
    
    public int totalPlaybackTime(){
        Iterator<Track> it= tracks.iterator();
        int totalTime= 0;
        while(it.hasNext()){
            Track nummer= it.next();
            totalTime= totalTime+nummer.getLength();
        }
        return totalTime;
    }

    public String getTitleLongestTrack(){
        int time = 0;
        Track longTrack  = null;
        Iterator<Track> it = tracks.iterator();
        while(it.hasNext()){
            Track track= it.next();
            if(track.getLength() > time){
              time = track.getLength();
              longTrack = track;
            }
       }//end while
       if( longTrack != null)
            return  longTrack.getTitle();
       else
            return null;
   }

    public String getTitleShortestTrack(){
        
        Track shortTrack  = null;
        Iterator<Track> it = tracks.iterator();
        Track track= it.next();
        int time = track.getLength();
        while(it.hasNext()){
            track= it.next();
            if(track.getLength() < time){
              time = track.getLength();
              shortTrack = track;
            }
       }//end while
       if( shortTrack != null)
            return  shortTrack.getTitle();
       else
            return null;
   }
   
   public ArrayList<Track> getTrackLongerThan(int tid){
        ArrayList<Track> longTrack = new ArrayList<Track>();
        for(Track track : tracks){
            if(track.getLength() > tid){
                longTrack.add(track);
            }
        }
        return longTrack;
    }
}









