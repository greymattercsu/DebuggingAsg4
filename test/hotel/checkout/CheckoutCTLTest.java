/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.checkout;

import hotel.HotelHelper;
import hotel.entities.Hotel;
import hotel.entities.ServiceType;
import hotel.service.RecordServiceCTL;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author bijan
 */
public class CheckoutCTLTest {
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
   
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
            System.setOut(new PrintStream(outContent));
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
        
        CheckoutCTL instance = new CheckoutCTL(hotel);
        instance.roomIdEntered(roomNumber);
        String actualOutput = outContent.toString();
        String actualTotalString = actualOutput.substring(actualOutput.indexOf("Total")+ 8);
        double actualTotal = Double.parseDouble(actualTotalString);
        assertEquals(total, actualTotal, 0);
    }
    
      /**
     * Test of roomIdEntered method, of class CheckoutCTL.
     * @throws java.lang.Exception
     */
    @Test
    public void testRoomIdEnteredTwoActiveService() throws Exception {
        int roomNumber = 301;
        double costRoomService = 7.00;
        double costBarFridge = 10.0;
        double total = costRoomService + costBarFridge;
        Hotel hotel = HotelHelper.loadHotel();
        RecordServiceCTL recordService = new RecordServiceCTL(hotel);
        recordService.roomNumberEntered(roomNumber);
        recordService.serviceDetailsEntered(ServiceType.BAR_FRIDGE, costBarFridge );
        
        CheckoutCTL instance = new CheckoutCTL(hotel);
        instance.roomIdEntered(roomNumber);
        String actualOutput = outContent.toString();
        String actualTotalString = actualOutput.substring(actualOutput.indexOf("Total")+ 8);
        double actualTotal = Double.parseDouble(actualTotalString);
        assertEquals(total, actualTotal, 0);
    }
    
    /**
     * Test of roomIdEntered method, of class CheckoutCTL.
     */
    @Test
    public void testRoomIdEnteredthreeActiveService() throws Exception {
        int roomNumber = 301;
        double costRoomService = 7.00;
        double costBarFridge = 10.0;
        double costRestaurant = 20.0;
        double total = costRoomService + costBarFridge + costRestaurant;
        Hotel hotel = HotelHelper.loadHotel();
        
        RecordServiceCTL recordService = new RecordServiceCTL(hotel);
        recordService.roomNumberEntered(roomNumber);
        recordService.serviceDetailsEntered(ServiceType.BAR_FRIDGE, costBarFridge );
        
        recordService = new RecordServiceCTL(hotel);
        recordService.roomNumberEntered(roomNumber);
        recordService.serviceDetailsEntered(ServiceType.RESTAURANT, costRestaurant );
        
        CheckoutCTL instance = new CheckoutCTL(hotel);
        instance.roomIdEntered(roomNumber);
        String actualOutput = outContent.toString();
        String actualTotalString = actualOutput.substring(actualOutput.indexOf("Total")+ 8);
        double actualTotal = Double.parseDouble(actualTotalString);
        assertEquals(total, actualTotal, 0);
    }

    
}
