/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.checkout;

import hotel.HotelHelper;
import hotel.entities.Hotel;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bijan
 */
public class CheckoutCTLTest {
    
   
    public CheckoutCTLTest() {
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
     * Test of roomIdEntered method, of class CheckoutCTL.
     * @throws java.lang.Exception
     */
    @Test
    public void testRoomIdEnteredDefaultService() throws Exception {
        int roomNumber = 301;
        double total = 7.00;
        Hotel hotel = HotelHelper.loadHotel();
    }
    
}
