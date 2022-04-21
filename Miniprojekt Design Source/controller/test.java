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
        friendCo1.addFriend("Julian", "Havnegade", "9000", "lborg", "25263395");
        friendCo1.addFriend("Kenni", "Vestergade 22", "7500", "Skive", "55609980");
        friendCo1.addFriend("Philip", "Strandvejen", "5000", "Ribe", "22445590");
        copyCont1 = new controller.CopyController();
        copyCont1.addCopy("Metallica", 11, "Januar", 100);
        copyCont1.addCopy("Michael Jackson", 22, "igr", 200);
        copyCont1.addCopy("Spice Girls", 33, "igr", 300);
        loanCont1 = new controller.LoanController();
        //loanCont1.addCopyToLoan(11);
        //loanCont1.addFriendToLoan("Kenni");
        //loanCont1.addLoan("11", "Januar", "Februar");
        //loanCont1.getReturnedDate("11");
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
