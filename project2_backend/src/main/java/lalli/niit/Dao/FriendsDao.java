package lalli.niit.Dao;

import java.util.List;

import lalli.niit.models.Friend;
import lalli.niit.models.User;

public interface FriendsDao {
List<User> getAllSuggestedUsers(String email);
List<Friend> pendingRequests(String email);
void friendRequest(Friend friend);
void acceptFriendRequest(Friend friend);
void deleteFriendRequest(Friend friend);
List<User> listOfFriends(String email);
}