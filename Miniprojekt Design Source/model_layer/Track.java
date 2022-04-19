package model_layer;

/**
 * Music track
 * 
 * @author (fen, mars) 
 * @version (2003.10.27, 2009.29.09)
 */
public class Track{
    private int length;//time in sec.
    private String title;
    
    /**
     * Constructor for objects of class Track
     */
    public Track(String tit, int len)    {
        this.length= len;
        title= tit;
    }

    public int getLength(){
        return length;
    }
    
    public String getTitle(){
        return title;
    }
}