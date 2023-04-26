/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Controller;

import controller.Airliner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class AirlinerTest {
    
    Airliner a = new Airliner();
    public AirlinerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getCountriesOperated method, of class Airliner.
     */
    @Test
    public void testGetCountriesOperated() {
        assertEquals(0,a.getCountriesOperated());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setCountriesOperated method, of class Airliner.
     */
    @Test
    public void testSetCountriesOperated() {
        a.setCountriesOperated(3);
        assertEquals(3,a.getCountriesOperated());
    }

    /**
     * Test of getOriginCountry method, of class Airliner.
     */
    @Test
    public void testGetOriginCountry() {
        assertEquals(null,a.getOriginCountry());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setOriginCountry method, of class Airliner.
     */
    @Test
    public void testSetOriginCountry() {
        a.setOriginCountry("Bangladesh");
        assertEquals("Bangladesh",a.getOriginCountry());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getName method, of class Airliner.
     */
    @Test
    public void testGetName() {
        assertEquals(null,a.getName());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setName method, of class Airliner.
     */
    @Test
    public void testSetName() {
        a.setName("jaeemul");
        assertEquals("jaeemul",a.getName());

    }

    /**
     * Test of getAirlineCode method, of class Airliner.
     */
    @Test
    public void testGetAirlineCode() {
        assertEquals(null,a.getAirlineCode());
        
    }

    /**
     * Test of setAirlineCode method, of class Airliner.
     */
    @Test
    public void testSetAirlineCode() {
        a.setAirlineCode("BA");
        assertEquals("BA",a.getAirlineCode());
        
    }

    /**
     * Test of getNumOfFlights method, of class Airliner.
     */
    @Test
    public void testGetNumOfFlights() {
        assertEquals(0,a.getNumOfFlights());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setNumOfFlights method, of class Airliner.
     */
    @Test
    public void testSetNumOfFlights() {
        a.setNumOfFlights(100);
        assertEquals(100,a.getNumOfFlights());
        
    }


    
}
