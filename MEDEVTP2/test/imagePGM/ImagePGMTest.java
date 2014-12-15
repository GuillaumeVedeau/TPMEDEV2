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
        instance.getImage().set(4, new Integer(0));
        instance.getImage().set(5, new Integer(0));
        instance.getImage().set(6, new Integer(100));
        instance.getImage().set(7, new Integer(100));
        instance.getImage().set(8, new Integer(50));
        instance.getImage().set(9, new Integer(100));
        instance.getImage().set(10, new Integer(255));
        instance.getImage().set(11, new Integer(255));
        instance.getImage().set(12, new Integer(100));
        instance.getImage().set(13, new Integer(150));
        instance.getImage().set(14, new Integer(255));
        instance.getImage().set(15, new Integer(255));
        
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
        testImage.getImage().set(0, Integer.valueOf(255));
        testImage.getImage().set(1, Integer.valueOf(250));
        testImage.getImage().set(2, Integer.valueOf(155));
        testImage.getImage().set(3, Integer.valueOf(150));
        testImage.getImage().set(4, Integer.valueOf(5));
        testImage.getImage().set(5, Integer.valueOf(0));
        
        ImagePGM instance = testImage.seuillage(152);
        
        ImagePGM instance2 =  new ImagePGM(2,3);
        instance2.getImage().set(0, Integer.valueOf(255));
        instance2.getImage().set(1, Integer.valueOf(255));
        instance2.getImage().set(2, Integer.valueOf(255));
        instance2.getImage().set(3, Integer.valueOf(0));
        instance2.getImage().set(4, Integer.valueOf(0));
        instance2.getImage().set(5, Integer.valueOf(0));
        
        
        assertEquals(instance2.getImage(), instance.getImage());
        
    }

    /**
     * Test of difference method, of class ImagePGM.
     */
    @Test
    public void testDifference() {
        System.out.println("difference");
        
        
        ImagePGM instance = new ImagePGM(4,4);
        instance.getImage().set(0, new Integer(0));
        instance.getImage().set(1, new Integer(255));
        instance.getImage().set(2, new Integer(100));
        instance.getImage().set(3, new Integer(150));
        instance.getImage().set(4, new Integer(100));
      
        
        ImagePGM instance2 = new ImagePGM(4,4);
        instance2.getImage().set(0, new Integer(0));
        instance2.getImage().set(1, new Integer(0));
        instance2.getImage().set(2, new Integer(50));
        instance2.getImage().set(3, new Integer(200));
        instance2.getImage().set(4, new Integer(100));
        
        
        ImagePGM instance3 = new ImagePGM(4,4);
        instance3.getImage().set(0, new Integer(0));
        instance3.getImage().set(1, new Integer(255));
        instance3.getImage().set(2, new Integer(50));
        instance3.getImage().set(3, new Integer(0));
        instance3.getImage().set(4, new Integer(0));
        
        ImagePGM instance4 = new ImagePGM(5,5);
        ImagePGM instance5 = new ImagePGM(4,4,255);
        
        assertEquals(instance.difference(instance2).getImage(), instance3.getImage());
        assertEquals(instance.difference(instance4).getImage(),instance5.getImage());
        
        
        
    }
}
