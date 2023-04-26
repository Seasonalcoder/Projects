/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Controller;

import controller.Customer;
import controller.Flight;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class CustomerTest {
    
    Customer c = new Customer();
    public CustomerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getSeatBooked method, of class Customer.
     */
    @Test
    public void testGetSeatBooked() {
        assertEquals(null,c.getSeatBooked());
    }

    /**
     * Test of setSeatBooked method, of class Customer.
     */
    @Test
    public void testSetSeatBooked() {
        c.setSeatBooked("K1");
        assertEquals("K1",c.getSeatBooked());
    }

    /**
     * Test of getFlightBooked method, of class Customer.
     */
    @Test
    public void testGetFlightBooked() {
        assertEquals(null,c.getFlightBooked());
    }

    /**
     * Test of getSsn method, of class Customer.
     */
    @Test
    public void testGetSsn() {
        assertEquals(null,c.getSsn());
    }

    /**
     * Test of setSsn method, of class Customer.
     */
    @Test
    public void testSetSsn() {
        c.setSsn("zxc");
        assertEquals("zxc",c.getSsn());
    }

    /**
     * Test of getAge method, of class Customer.
     */
    @Test
    public void testGetAge() {
        assertEquals(0,c.getAge());
    }

    /**
     * Test of setAge method, of class Customer.
     */
    @Test
    public void testSetAge() {
        c.setAge(3);
        assertEquals(3,c.getAge());
    }

    /**
     * Test of getFirstName method, of class Customer.
     */
    @Test
    public void testGetFirstName() {
        assertEquals(null,c.getFirstName());
    }

    /**
     * Test of setFirstName method, of class Customer.
     */
    @Test
    public void testSetFirstName() {
        c.setFirstName("Jaeemul");
        assertEquals("Jaeemul",c.getFirstName());
    }

    /**
     * Test of getLastName method, of class Customer.
     */
    @Test
    public void testGetLastName() {
        assertEquals(null,c.getLastName());
    }

    /**
     * Test of setLastName method, of class Customer.
     */
    @Test
    public void testSetLastName() {
        c.setLastName("Hossain");
        assertEquals("Hossain",c.getLastName());
    }

    /**
     * Test of getPhNum method, of class Customer.
     */
    @Test
    public void testGetPhNum() {
        assertEquals(null,c.getPhNum());
    }

    /**
     * Test of setPhNum method, of class Customer.
     */
    @Test
    public void testSetPhNum() {
        c.setPhNum("01723087490");
        assertEquals("01723087490",c.getPhNum());
    }
    
}
