package tui_layer;

import model_layer.*;
import control_layer.*;
import java.util.Scanner;
//HELLOOO
/**
 * Write a description of class Menu here.
 * 
 * @author (Kis Boisen Hansen) 
 * @version (2010.04.08, 2012.04.10)
 * @author (fen) 
 * @version (2016.10.04)
 * @author (gibe) 
 * @version (2016.10.12)
 */
public class Menu{
    private CDController cdCtrl;
    
    public Menu(){
        cdCtrl = new CDController();
        mainMenuStart();
    }

    public void mainMenuStart(){
        boolean exit=false;
        while (!exit){//! means while exit not is true (that is: false)
            int choice = writeMainMenu();
            switch (choice) {
                case 1:
                    startCreateCD();
                    break;
                case 2:
                    startFindCD();
                    break;
                case 3:
                    startAddTrack();
                    break;
                case 4:
                    exit = true;
                    writeEnd();
                    break;
                default:
                    break;
            }
        }//end while
    }//end start

    private int writeMainMenu(){       
        System.out.println("\f *** MainMenu ***");
        System.out.println(" (1)Create CD");
        System.out.println(" (2)Find CD");
        System.out.println(" (3)Create track for CD");
        System.out.println(" (4)Close");
        System.out.print("\n Make your choice: ");
        
        // creates a keyboard object to read input
        Scanner keyboard = new Scanner(System.in);
        int choice;
        if (keyboard.hasNextInt()){
            choice = keyboard.nextInt(); 
        }
        else {
            choice = 0;
        }
        return choice;
    }

    private void startCreateCD(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type CD number");
        int inCDNo = keyboard.nextInt();
        System.out.println("Type title ");
        String inTitle = keyboard.next();
        cdCtrl.createCD(inCDNo,inTitle); 
    }

    private void startFindCD(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type title ");
        String inTitle = keyboard.next();
        CD cdObj = cdCtrl.findCD(inTitle);
        if(cdObj != null){
            System.out.println("CD info ");
            System.out.println("Title : "+ cdObj.getTitle());
            System.out.println("Number of tracks " + cdObj.getTrackCount());
        }
        else{
            System.out.println("CD not found");
        }
        pause();
    }

    private void startAddTrack(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type cd title ");
        String inTitle = keyboard.nextLine();
        System.out.println("Type track  title ");
        String inTrack = keyboard.nextLine();
        System.out.println("Type playing time ");
        int length = keyboard.nextInt();
        cdCtrl.addTrack(inTitle,inTrack,length);
    }


    private void writeEnd(){
        System.out.println(" The system is shutting down ");
    }

    private void pause(){
        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();
    }

}
