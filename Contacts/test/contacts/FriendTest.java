/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CCannon
 */
public class FriendTest {
    
    public FriendTest() {
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

    /**
     * Test of toString method, of class Friend.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Friend instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPhoneNumber method, of class Friend.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        Friend instance = null;
        int expResult = 0;
        int result = instance.getPhoneNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhoneNumber method, of class Friend.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        int phoneNumber = 0;
        Friend instance = null;
        instance.setPhoneNumber(phoneNumber);
        assertEquals(instane,phoneNumber);
    }
    
}
