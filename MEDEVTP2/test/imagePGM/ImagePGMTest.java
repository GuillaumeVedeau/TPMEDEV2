/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imagePGM;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gvedeau
 */
public class ImagePGMTest {
    
    public ImagePGMTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * Test of agrandir method, of class ImagePGM.
     */
    @Test
    public void testAgrandir() {
        System.out.println("agrandir");
        int rapport = 2;
        ImagePGM instance = new ImagePGM(2,2);
        instance.getImage().set(0, new Integer(0));
        instance.getImage().set(1, new Integer(100));
        instance.getImage().set(2, new Integer(200));
        instance.getImage().set(3, new Integer(255));
        
        ImagePGM result = instance.agrandir(rapport);
        
        assertTrue(result.getImage().get(0).intValue() == instance.getImage().get(0).intValue());
        assertTrue(result.getImage().get(1).intValue() == instance.getImage().get(0).intValue());
        assertTrue(result.getImage().get(2).intValue() == instance.getImage().get(1).intValue());
        assertTrue(result.getImage().get(3).intValue() == instance.getImage().get(1).intValue());
        assertTrue(result.getImage().get(4).intValue() == instance.getImage().get(0).intValue());
        assertTrue(result.getImage().get(5).intValue() == instance.getImage().get(0).intValue());
        assertTrue(result.getImage().get(6).intValue() == instance.getImage().get(1).intValue());
        assertTrue(result.getImage().get(7).intValue() == instance.getImage().get(1).intValue());
        assertTrue(result.getImage().get(8).intValue() == instance.getImage().get(2).intValue());
        assertTrue(result.getImage().get(9).intValue() == instance.getImage().get(2).intValue());
        assertTrue(result.getImage().get(10).intValue() == instance.getImage().get(3).intValue());
        assertTrue(result.getImage().get(11).intValue() == instance.getImage().get(3).intValue());
        assertTrue(result.getImage().get(12).intValue() == instance.getImage().get(2).intValue());
        assertTrue(result.getImage().get(13).intValue() == instance.getImage().get(2).intValue());
        assertTrue(result.getImage().get(14).intValue() == instance.getImage().get(3).intValue());
        assertTrue(result.getImage().get(15).intValue() == instance.getImage().get(3).intValue());
        
        
    }

    /**
     * Test of retrecir method, of class ImagePGM.
     */
    @Test
    public void testRetrecir() {
        System.out.println("retrecir");
        int rapport = 2;
        ImagePGM instance = new ImagePGM(4,4);
        instance.getImage().set(0, new Integer(0));
        instance.getImage().set(1, new Integer(0));
        instance.getImage().set(2, new Integer(100));
        instance.getImage().set(3, new Integer(100));
        instance.getImage().set(0, new Integer(0));
        instance.getImage().set(1, new Integer(0));
        instance.getImage().set(2, new Integer(100));
        instance.getImage().set(3, new Integer(100));
        instance.getImage().set(0, new Integer(50));
        instance.getImage().set(1, new Integer(100));
        instance.getImage().set(2, new Integer(255));
        instance.getImage().set(3, new Integer(255));
        instance.getImage().set(0, new Integer(100));
        instance.getImage().set(1, new Integer(150));
        instance.getImage().set(2, new Integer(255));
        instance.getImage().set(3, new Integer(255));
        
        ImagePGM result = instance.retrecir(rapport);
        
        assertTrue(result.getImage().get(0).intValue() == 0);
        assertTrue(result.getImage().get(1).intValue() == 100);
        assertTrue(result.getImage().get(2).intValue() == 100);
        assertTrue(result.getImage().get(3).intValue() == 255);
        
    }

    /**
     * Test of seuillage method, of class ImagePGM.
     */
    @Test
    public void testSeuillage() {
        System.out.println("seuillage");
        
    }

    /**
     * Test of difference method, of class ImagePGM.
     */
    @Test
    public void testDifference() {
        System.out.println("difference");
        ImagePGM imageASoustraire = null;
        ImagePGM instance = new ImagePGM();
        ImagePGM expResult = null;
        ImagePGM result = instance.difference(imageASoustraire);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}