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
        ArrayList<Integer> testPixels = new ArrayList<>();
        testPixels.add(255);
        testPixels.add(250);
        testPixels.add(155);
        testPixels.add(150);
        testPixels.add(5);
        testPixels.add(0);
        testImage.setImage(testPixels);
        ImagePGM testImageASoustraire = new ImagePGM(2,3);
        testPixels.set(0,0);
        testPixels.set(1,5);
        testPixels.set(2,150);
        testPixels.set(3,-200);
        testPixels.set(4,250);
        testPixels.set(5,255);
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
