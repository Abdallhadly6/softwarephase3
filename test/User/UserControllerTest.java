package User;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserControllerTest {
    
    public UserControllerTest() {
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
    public void testSignUp() {
        System.out.println("signUp");
        String username = "";
        String pass = "";
        String email = "";
        String gender = "";
        String country = "";
        String birthDate = "";
        UserController instance = new UserController();
        User expResult = null;
        User result = instance.signUp(username, pass, email, gender, country, birthDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


}
