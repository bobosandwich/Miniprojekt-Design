package controller;
import model.*;


/**
 * Write a description of class FriendController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FriendController {
    private FriendContainer friends;
    
    
    public FriendController() {
        // initialise instance variables
        friends = FriendContainer.getInstance();
    }

    public void addFriend(String name){
        Friend newFriend = new Friend(name);
        friends.addFriend(newFriend);
        
    }
}

