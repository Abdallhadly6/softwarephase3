package User;

import java.util.ArrayList;

public class UserController extends PremiumUser {

  public User signUp(String username, String pass, String email, String gender, String country, String birthDate) {
      User u = new User();
      if(username.isEmpty() && email.isEmpty() && pass.isEmpty() && gender.isEmpty() 
              && country.isEmpty()&& birthDate.isEmpty()){ 
            System.out.println("Please enter the missing information.");
      }
      for(int i = 0 ; i < u.users.size() ; i++){
          if(email.equals(u.email));
          System.out.println("This mail aleardy existing");
      }
      u.username = username;
      u.email = email;
      u.password  = pass;            
      u.country = country;
      u.birthDate = birthDate;
      u.gender = gender; 
     return u; 
  }

  public User login(String username, String password) {
      User u = new User();
      for(int i = 0 ; i < u.users.size() ; i++){
            if (username.equals(u.username) && password.equals(u.password)) {
              System.out.println("Welcome!" + u.username);
             }
            else if (username.equals(u.username)) {
              System.out.println("Invalid Password!");
            } else if (password.equals(u.password)) {
              System.out.println("Invalid Username!");
            } else {
              System.out.println("Invalid Username & Password!");
            }
    }   
  return u;
}

  public ArrayList<User> getAllUsers() {
  return null;
  }

}