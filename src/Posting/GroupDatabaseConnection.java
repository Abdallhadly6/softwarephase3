package Posting;

public class GroupDatabaseConnection {
    private static GroupDatabaseConnection instance;

    public static GroupDatabaseConnection getInstance() {
        if(instance == null){
            instance = new GroupDatabaseConnection();
        }
        return instance;
    }
    private GroupDatabaseConnection() {
    }
  public boolean storeCreatedGroup(Group group) {
  return false;
  }

}