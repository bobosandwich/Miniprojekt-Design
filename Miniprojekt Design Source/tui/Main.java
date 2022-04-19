package tui;


/**
 * Starts the system and create some test data
 *
 * @author (FEN)
 * @version (2021-11-03)
 */
public class Main{
    private Menu menu;
    private Tester tester;

    public Main(){
        tester = new Tester();
        tester.generateData();
        menu = new Menu();
    }

}
