package Posting;

import User.User;
import java.util.ArrayList;

public class Page {
  public String name;
  public User owner;
  public ArrayList<User> admins;
  public ArrayList<Post> posts;
  public int likes;
  public String desc;
  public ArrayList<User> likedUsers;

  public boolean addMember(User user) {
  return false;
  }

  public void addAdmin(User user) {
  }

  public void addPost(Post post) {
  }

}