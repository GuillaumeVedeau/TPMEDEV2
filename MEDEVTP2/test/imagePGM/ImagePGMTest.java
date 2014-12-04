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
        ImagePGM instance = new ImagePGM();
        ImagePGM expResult = null;
        ImagePGM result = instance.agrandir(rapport);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retrecir method, of class ImagePGM.
     */
    @Test
    public void testRetrecir() {
        System.out.println("retrecir");
        int rapport = 0;
        ImagePGM instance = new ImagePGM();
        ImagePGM expResult = null;
        ImagePGM result = instance.retrecir(rapport);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seuillage method, of class ImagePGM.
     */
    @Test
    public void testSeuillage() {
        System.out.println("seuillage");
        
        ImagePGM testImage = new ImagePGM(2,3);
        ArrayList<Integer> testPixels = new ArrayList<Integer>();
        testPixels.add(255);
        testPixels.add(250);
        testPixels.add(155);
        testPixels.add(150);
        testPixels.add(5);
        testPixels.add(0);
        testImage.setImage(testPixels);
        ImagePGM testImageSeuil = new ImagePGM(2,3);
        testImageSeuil = testImage.seuillage(152);
        
        ArrayList<Integer> expResult = new ArrayList<>();
        expResult.add(255);
        expResult.add(255);
        expResult.add(255);
        expResult.add(0);
        expResult.add(0);
        expResult.add(0);
        
        assertEquals(expResult, testImageSeuil.getImage());
        assertEquals(2, testImageSeuil.getHauteur());
        assertEquals(3, testImageSeuil.getLongueur());
       
        assertEquals(null, testImage.seuillage(300));
        
    }

    /**
     * Test of difference method, of class ImagePGM.
     */
    @Test
    public void testDifference() {
        System.out.println("difference");
        
        ImagePGM testImage = new ImagePGM(2,3);
        ArrayList<Integer> testPixels = new ArrayList<Integer>();
        testPixels.add(255);
        testPixels.add(250);
        testPixels.add(155);
        testPixels.add(150);
        testPixels.add(5);
        testPixels.add(0);
        testImage.setImage(testPixels);
        ImagePGM testImageASoustraire = new ImagePGM(2,3);
        testPixels.set(0,0);
        testPixels.add(1,5);
        testPixels.add(2,150);
        testPixels.add(3,-200);
        testPixels.add(4,250);
        testPixels.add(5,255);
        testImageASoustraire.setImage(testPixels);
        ImagePGM result = testImage.difference(testImageASoustraire);
        
        ArrayList<Integer> expResult = new ArrayList<>();
        expResult.add(255);
        expResult.add(245);
        expResult.add(5);
        expResult.add(255);
        expResult.add(0);
        expResult.add(0);
        
        assertEquals(expResult, result.getImage());
        assertEquals(2, result.getHauteur());
        assertEquals(3, result.getLongueur());
        
        assertEquals(null, testImage.difference(new ImagePGM(3,3)));
    }
}