
package User;

import Posting.Group;
import Posting.Page;
import Posting.Post;
import java.sql.Time;
import java.util.ArrayList;
class creditcard{
    String number;
    int credit;
}
public class User {
  public creditcard card;
  public String id;
  public String gender;
  public String email;
  public ArrayList<User> friends;
   public ArrayList<User> users;
  public ArrayList<Post> posts;
  public String username;
  public String password;
  public String country;
  public String birthDate;
  public ArrayList<User> friendRequests;
  public boolean prem;

  public boolean sendFriendRequest(User user){
      if(this.searchUser(user.username )){
          System.out.println("User Exist You Can Send Your Request");
          return true;
      }
          
      System.out.println("User  Not Exist You Can't Send Your Request");
      return false;
  }

  public void getFriendRequests(User user) {
        if(sendFriendRequest(this)){
            boolean accept = true;
            System.out.println("You Can Accept The Request!");
            System.out.println("You Can Delete The Request!");
            if(accept){
                ArrayList<Post> posts1 = this.posts;
                System.out.println("he/she can see");
                for(int i = 0 ; i < posts1.size() ; i++){
                    System.out.println(posts1.get(i).numOfShares);
                    System.out.println(posts1.get(i).numOfLikes);
                    System.out.println(posts1.get(i).time);
                }   
            }
            else{
               System.out.println("Request Deleted!"); 
            }
        }
        else{
            System.out.println("You Havn't any friend Request!");
        }
  }

  public boolean searchUser(String usernameOrEmail) {
      User u = new User();
     for(int i = 0 ; i < u.users.size() ; i++){
          if(usernameOrEmail.equals(u.email) || usernameOrEmail.equals(u.username));
          return true;
      }
     return false;
  }

  public Group searchGroup(String groupName) {
  return null;
  }

  public Page searchPage(String pageName) {
  return null;
  }

  public void likePage(Page page) {
  }

  public void joinGroup(Group group) {
  }

  public ArrayList<Post> searchForHash(String hash) {
  return null;
  }
  public boolean checkcredit(String creditcardnum){
      if(creditcardnum.length() < 10 ){
           System.out.println("invalid credit card");
           return false;
      }
      else{
          if(creditcardnum == card.number){
              return true;
          }
          else{
              return false;
          }
      }
           
  }
}
