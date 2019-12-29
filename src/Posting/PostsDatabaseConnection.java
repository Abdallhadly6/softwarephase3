package Posting;

public class PostsDatabaseConnection {
    private static PostsDatabaseConnection instance;

    public static PostsDatabaseConnection getInstance() {
        if(instance == null){
            instance = new PostsDatabaseConnection();
        }
        return instance;
    }
    private PostsDatabaseConnection() {
    }

  public boolean storePost(Post post) {
  return false;
  }

} 

