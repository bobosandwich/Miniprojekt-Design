package model;


/**
 * Write a description of class Lp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lp
{
    private int barCode;
    private String title;
    private String artist;
    private String publicationDate;

    
    public Lp(int barCode, String title, String artist, String publicationDate)
    {
        this.barCode = barCode;
        this.title = title;
        this.artist = artist;
        this.publicationDate = publicationDate;
    }

    
}
