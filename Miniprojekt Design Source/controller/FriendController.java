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

    public Friend findFriend(String name){
        return FriendContainer.getInstance().findFriend(name);  
    }

    // Update Friend Method
    public boolean updateFriend(String name, Friend newData){
        boolean success = false;
        Friend friend = FriendContainer.getInstance().findFriend(name);
        if (friend != null && newData != null){
            if (newData.getAddress() != null){
                friend.setAddress(newData.getAddress());
            }
            if (newData.getPostalCode() != null){
                friend.setAddress(newData.getAddress());
            }
            if (newData.getCity() != null){
                friend.setCity(newData.getCity());
            }
            if (newData.getPhone() != null){
                friend.setPhone(newData.getPhone());
            }
            FriendContainer.getInstance().deleteFriend(name);
            FriendContainer.getInstance().addFriend(friend);
            if (friend.equals(FriendContainer.getInstance().findFriend(name))){
                success = true;
            }
        }
        return success;
    }
}

