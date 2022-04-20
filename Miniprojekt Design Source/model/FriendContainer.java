package model;
import java.util.ArrayList;


/**
 * Write a description of class FriendContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */



public class FriendContainer {
    private static FriendContainer instance;
    private ArrayList<Friend> friends;
    /**
     * Constructor for objects of class StudentContainer
     */
    private FriendContainer() {
        // initialise instance variables
        friends = new ArrayList<>();
    }
    
    public static FriendContainer getInstance() {
        if (instance == null) {
            instance = new FriendContainer();
        }
        return instance;
    }
    
    public void addFriend(Friend friend){
        friends.add(friend);
    }
    
    public void findFriend(String name){
        
    }
}
