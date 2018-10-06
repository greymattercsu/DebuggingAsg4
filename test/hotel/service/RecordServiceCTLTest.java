/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.service;

import hotel.HotelHelper;
import hotel.checkout.CheckoutCTL;
import hotel.entities.Hotel;
import hotel.entities.ServiceType;
import hotel.utils.IOUtils;
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
public class RecordServiceCTLTest {
        private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    
    public RecordServiceCTLTest() {
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


    
}
