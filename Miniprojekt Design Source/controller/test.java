package controller;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Testklassen test.
 *
 * @author (dit navn her)
 * @version (versionsnummer eller dato her)
 */
public class test
{
    
    LpController lpController;
    FriendController friendController;
    LoanController loanController;
    /**
     * Standardkonstruktør for testklassen test
     */
    public test()
    {
        lpController = new LpController();
        friendController = new FriendController();
        loanController = new LoanController();
        
        
    }

    /**
     * Opsæt test-fixtures.
     *
     * Kaldt før hver testmetode.
     */
    @BeforeEach
    public void setUp()
    {
        
        friendController.addFriend("kenni", "address", "postalCode", "city", "phone");
        friendController.addFriend("robert", "address", "postalCode", "city", "phone");
        friendController.addFriend("julian", "address", "postalCode", "city", "phone");
        lpController.addLp(1, "frank", "januar", "2000");
        lpController.addLp(2, "james", "feb", "3000");
        lpController.addLp(3, "kenni", "kolo", "4000");
        lpController.addCopyToLp(1, 123, "21", 500);
        lpController.addCopyToLp(2, 163, "25", 340);
        lpController.addCopyToLp(3, 113, "21", 300);
        lpController.findGoThroughLpContainer(163);
        
    }

    /**
     * River test-fixture ned.
     *
     * Kaldt efter hver testmetode.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
