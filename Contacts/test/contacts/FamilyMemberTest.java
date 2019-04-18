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
public class FamilyMemberTest {
    
    public FamilyMemberTest() {
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
     * Test of toString method, of class FamilyMember.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        FamilyMember instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRelationship method, of class FamilyMember.
     */
    @Test
    public void testGetRelationship() {
        System.out.println("getRelationship");
        FamilyMember instance = null;
        FamilyRelationship expResult = null;
        FamilyRelationship result = instance.getRelationship();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRelationship method, of class FamilyMember.
     */
    @Test
    public void testSetRelationship() {
        System.out.println("setRelationship");
        FamilyRelationship relationship = null;
        FamilyMember instance = null;
        instance.setRelationship(relationship);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
