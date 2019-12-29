
package Messaging;

public class MessageDatabaseConnection {
    private static MessageDatabaseConnection instance;

    public static MessageDatabaseConnection getInstance() {
        if(instance == null){
            instance = new MessageDatabaseConnection();
        }
        return instance;
    }
    private MessageDatabaseConnection() {
    }
  public boolean storeMessage(Message message) {
  return false;
  }
    
}
