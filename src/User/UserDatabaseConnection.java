package User;

import java.util.ArrayList;

public class UserDatabaseConnection{
    
    private static UserDatabaseConnection instance;

    public static UserDatabaseConnection getInstance() {
        if(instance == null){
            instance = new UserDatabaseConnection();
        }
        return instance;
    }
    private UserDatabaseConnection() {
    }
    
  public User storeSignupData(String username, String pass, String email, boolean gender) {
  return null;
  }

  public User checkLoginData(String username, String password) {
  return null;
  }

  public ArrayList<User> getUsers() {
  return null;
  }

}