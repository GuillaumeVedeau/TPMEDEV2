/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imagePGM;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gvedeau
 */
public class ChargementImageTest {
    
    public ChargementImageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of ChargerImage method, of class ChargementImage.
     */
    @Test
    public void testChargerImage() {
        System.out.println("ChargerImage");
        ChargementImage instance = null;
        ImagePGM expResult = null;
        ImagePGM result = instance.ChargerImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImage method, of class ChargementImage.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        ChargementImage instance = null;
        ImagePGM expResult = null;
        ImagePGM result = instance.getImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImage method, of class ChargementImage.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        ImagePGM image = null;
        ChargementImage instance = null;
        instance.setImage(image);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}