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
public class FishGameTest {
    
    public FishGameTest() {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of draw method, of class FishGame.
     */
    @org.junit.jupiter.api.Test
    public void testDraw() {
        System.out.println("draw");
        Card expResult = null;
        Card result = FishGame.draw();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deckSize method, of class FishGame.
     */
    @org.junit.jupiter.api.Test
    public void testDeckSize() {
        System.out.println("deckSize");
        int expResult = 0;
        int result = FishGame.deckSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class FishGame.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        FishGame.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
