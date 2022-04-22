/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Arsh Gabbi
 */
public class PlayerTest {
    
    public PlayerTest() {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of hasGiven method, of class Player.
     */
    @org.junit.jupiter.api.Test
    public void testHasGiven() {
        System.out.println("hasGiven");
        Card cType = null;
        Player instance = new PlayerImpl();
        boolean expResult = false;
        boolean result = instance.hasGiven(cType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of giveAll method, of class Player.
     */
    @org.junit.jupiter.api.Test
    public void testGiveAll() {
        System.out.println("giveAll");
        Card cType = null;
        Player instance = new PlayerImpl();
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.giveAll(cType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumBooks method, of class Player.
     */
    @org.junit.jupiter.api.Test
    public void testGetNumBooks() {
        System.out.println("getNumBooks");
        Player instance = new PlayerImpl();
        int expResult = 0;
        int result = instance.getNumBooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of haveTurn method, of class Player.
     */
    @org.junit.jupiter.api.Test
    public void testHaveTurn() {
        System.out.println("haveTurn");
        Player instance = new PlayerImpl();
        instance.haveTurn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PlayerImpl extends Player {

        public void haveTurn() {
            
            
            
            
        }
    }
    
}
