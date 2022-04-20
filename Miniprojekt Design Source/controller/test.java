package controller;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class test
{
    private controller.FriendController friendCo1;
    private controller.FriendController friendCo2;
    private controller.FriendController friendCo3;
    private controller.CopyController copyCont1;
    private controller.CopyController copyCont2;
    private controller.CopyController copyCont3;
    private controller.LoanController loanCont1;
    private controller.LoanController loanCont2;
    private controller.LoanController loanCont3;

    /**
     * Default constructor for test class test
     */
    public test()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        friendCo1 = new controller.FriendController();
        friendCo2 = new controller.FriendController();
        friendCo3 = new controller.FriendController();
        friendCo1.addFriend("Julian", "Havnegade", "9000", "Ålborg", "25263395");
        friendCo2.addFriend("Kenni", "Vestergade 22", "7500", "Skive", "55609980");
        friendCo3.addFriend("Philip", "Strandvejen", "5000", "Ribe", "22445590");
        copyCont1 = new controller.CopyController();
        copyCont1.addCopy("Metallica", 11, "Januar", 100);
        copyCont2 = new controller.CopyController();
        copyCont2.addCopy("Michael Jackson", 22, "igår", 200);
        copyCont3 = new controller.CopyController();
        copyCont3.addCopy("Spice Girls", 33, "igår", 300);
        loanCont1 = new controller.LoanController();
        loanCont1.addLoan("1", "igår", "imorgen");
        loanCont2 = new controller.LoanController();
        loanCont2.addLoan("2", "igår", "imorgen");
        loanCont3 = new controller.LoanController();
        loanCont3.addLoan("3", "igår", "imorgen");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
