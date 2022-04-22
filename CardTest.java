/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Arsh Gabbi
 */
public class CardTest {
    
    public CardTest() {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of values method, of class Card.
     */
    @org.junit.jupiter.api.Test
    public void testValues() {
        System.out.println("values");
        Card[] expResult = null;
        Card[] result = Card.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Card.
     */
    @org.junit.jupiter.api.Test
    public void testValueOf() {
        System.out.println("valueOf");
        String string = "";
        Card expResult = null;
        Card result = Card.valueOf(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
