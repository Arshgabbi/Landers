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
public class HumanPlayerTest {
    
    public HumanPlayerTest() {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of haveTurn method, of class HumanPlayer.
     */
    @org.junit.jupiter.api.Test
    public void testHaveTurn() {
        System.out.println("haveTurn");
        HumanPlayer instance = new HumanPlayer();
        instance.haveTurn();
        fail("The test case is a prototype.");
        
    }
    @Test
    public class testHaveTurnGood(){
    System.out.println("Checking if the input is number");
    Int Intt=1||2||3||4||5||6||7||8||9||10||11||12||13;
    boolean expResult =true;
    boolean result = testHaveTurnGood.checktestHaveTurn(intt);
    assertEquals(expResult,result);
    
    }
    @Test
    public class testHaveTurnBad(){
    System.out.println("Checking if the input is number");
    Int Intt=1||2||3||4||5||6||7||8||9;
    boolean expResult =true;
    boolean result = testHaveTurnGood.checktestHaveTurn(intt);
    assertEquals(expResult,result);
    
    }
    @Test
    public class testHaveTurnBoundary(){
    System.out.println("Checking if the input is number");
    Int Intt=1||2||3||4||5||6||7||8||9||10||11||12||13;
    boolean expResult =true;
    boolean result = testHaveTurnGood.checktestHaveTurn(intt);
    assertEquals(expResult,result);
    
    }
}
    
    
    
    
    

