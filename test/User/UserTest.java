
package User;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {
    
    public UserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    @Test
    public void testSendFriendRequest() {
        System.out.println("sendFriendRequest");
        User user = null;
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.sendFriendRequest(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

  
    @Test
    public void testGetFriendRequests() {
        System.out.println("getFriendRequests");
        User user = null;
        User instance = new User();
        instance.getFriendRequests(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


 
}
