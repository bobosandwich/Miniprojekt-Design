package tui;

 
import controller.*;
import model.*;
import java.util.Scanner;
import java.util.ArrayList;


/**
 * Write a description of class LoanMenu here.
 *
 * @author Mogens Holm Iversen
 * @version 0.1.0 Initial draft version 
 */
public class LoanMenu {
    private LoanController loanController;
    private CopyController copyController;
    private FriendController friendController;
    private LpController lpController;
    

    /**
     * Constructor for objects of class LoanMenu
     */
    public LoanMenu() {
        // initialise instance variables
        loanController = new LoanController();
        copyController = new CopyController();
        friendController = new FriendController();
        lpController = new LpController();
    }
    
    public void start() {
        boolean running = true;
        while (running) {
            int choice = writeLoanMenu();
            if (choice == 1) {
                createLoanUserInteraction();
            }
            //TODO perhaps you need further menu items?
            else {
                running = false;
            }
        }
    }

    private int writeLoanMenu() {
        // creates a keyboard object to read input
        TextOptions menu = new TextOptions("\n ***** Udlånsmenu *****", "Tilbage"); 
        menu.addOption("Opret lån");
        menu.addOption("slet");
        //TODO if you need more menu items they have to go here
        int choice = menu.prompt();

        return choice;
    }
    
    public void createLoanUserInteraction(){
        Copy copy = null;
        Friend friend = null;
        Scanner reader = new Scanner(System.in);

        while(copy == null){
            System.out.println("Indtast serienummer: ");
            int input = reader.nextInt();
            copy = loanController.findGoThroughLpContainer(input);
            
           
            //This get called after we have chosen our copy - this might be another method
            
            if(copy == null){
                System.out.println("Denne kopi eksisterer ikke i systemet");
            }
        }

        while(friend == null){
            System.out.println("Indtast navn");
            String input = reader.nextLine();
            friend = loanController.addFriendToLoan(input);
            
            if(friend == null){
                System.out.println("Denne ven eksisterer ikke i systemet");
            }
        }
        
        loanController.addLoan();
    }
    
    

}
