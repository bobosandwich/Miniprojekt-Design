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

    public Friend findFriend (String name){
        int index = 0;
        boolean found = false;

        while(index < friends.size() && !found){
            Friend friend = friends.get(index);
            if(friend.getName().equals(name)){
                found = true;}

            else{
                index++;
            }
        }
        if(found){
            return friends.get(index);
        }
        else{
            return null;
        }
    }

    public void deleteFriend(String name){
        Friend friend = findFriend(name); 
        if(friend != null){
            friends.remove(friend); 

        }

    }
    
}
