package tui;
import model.*;

/**
 * Create TestData for the CD system
 *
 * @author (FEN)
 * @version (2021-11-03)
 */
public class Tester{
    private CDCollection cds;

    public Tester(){
        cds = CDCollection.getInstance();
    }

    public void generateData(){
        CD cd1 = new CD(1, "CD1");
        CD cd2 = new CD(2, "CD2");
        CD cd3 = new CD(3, "CD3");
        CD cd4 = new CD(4, "CD4");
        cds.addCD(cd1);
        cds.addCD(cd2);
        cds.addCD(cd3);
        cds.addCD(cd4);
        Track track1_1 = new Track("Track1-1", 110);
        Track track1_2 = new Track("Track1-2", 111);
        Track track2_1 = new Track("Track2-1", 100);
        Track track3_1 = new Track("Track3-1", 210); 
        cd1.addTrack(track1_1);
        cd1.addTrack(track1_2);
        cd2.addTrack(track2_1);
        cd3.addTrack(track3_1);
    }
}
