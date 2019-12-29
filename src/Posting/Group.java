package Posting;

import User.User;
import java.util.ArrayList;


public class Group {
  public String name;
  public User owner;
  public ArrayList<User> admins;
  public ArrayList<Post> posts;
  public int joins;
  public String desc;
  public ArrayList<User> joinedUsers;
  public boolean addMember(User user) {
  return false;
  }

  public void addAdmin(User user) {
  }

  public void addPost(Post post) {
  }

}