package Posting;

public class PageDatabaseConnection {
    private static PageDatabaseConnection instance;

    public static PageDatabaseConnection getInstance() {
        if(instance == null){
            instance = new PageDatabaseConnection();
        }
        return instance;
    }
    private PageDatabaseConnection() {
    }

  public boolean storeCreatedPage(Page page) {
  return false;
  }

}