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
                opretLånBrugerInteraktion();
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
        menu.addOption("delete");
        //TODO if you need more menu items they have to go here
        int choice = menu.prompt();

        return choice;
    }
    
    public void opretLånBrugerInteraktion(){
        Copy copy = null;
        Friend friend = null;
        Scanner reader = new Scanner(System.in);
        ArrayList <Copy> tempCollection = null;
        int tempBarCode;
        while(copy == null){
            System.out.println("Find a LP - write a barcode");
            int input = reader.nextInt();
            tempBarCode = input;
            //We need a method to go through the collection and print the copies information
            tempCollection = loanController.findLpCollection(input);
            printCollection(tempCollection);
            //reset input
            input = 0;
            // somewhere in between we need to choose our copy
            System.out.println("Choose the copy you want to lend: ");
            input = reader.nextInt();
            Copy tempCopy = lpController.findCopy(input, tempBarCode);
            loanController.addCopyToLoan(tempCopy);
            copy = tempCopy;
            
            
            //This get called after we have chosen our copy - this might be another method
            
            if(copy == null){
                System.out.println("This copy does not exist in the system");
            }
        }
    
        while(friend == null){
            System.out.println("Enter name");
            String input = reader.nextLine();
            friend = loanController.addFriendToLoan(input);
            
            if(friend == null){
                System.out.println("This friend does not exist");
            }
        }
        
        loanController.addLoan();
    }
    
    private void printCollection(ArrayList<Copy> tempArray){
        System.out.print("These copies has been found: ");
        for(int index = 0; index < tempArray.size(); index++){
             System.out.println(" [" + (index+1) + "]\t" + "Copy number: " + 
             tempArray.get(index).getSerialNumber() + "Avaliable: "+ tempArray.get(index).getAvailability());
        }
    }
    
    private Copy getCopy(int input, ArrayList<Copy> tempArray){
        Copy copy = null;
        for(int index = 0; index < tempArray.size(); index++){
            if(input == tempArray.get(index).getSerialNumber()){
                copy = tempArray.get(index);
            }
        }
        return copy;
    }
}
