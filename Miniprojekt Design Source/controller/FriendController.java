package controller;
import model.*;


/**
 * Write a description of class FriendController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FriendController {
    
    
    
   

    public void addFriend(String name, String address, String postalCode, String city, String phone){
        Friend newFriend = new Friend(name, address, postalCode, city, phone);
        FriendContainer.getInstance().addFriend(newFriend);
        
    }
}

