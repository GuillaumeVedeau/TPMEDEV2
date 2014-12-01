/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imagePGM;

import java.util.ArrayList;

/**
 *gere les objets PGM
 * @author gvedeau
 */
public class ImagePGM {
    
    private int hauteur;
    private int longueur;
    private ArrayList<Integer> image;
    
    

    /**
     * Get the value of longueur
     *
     * @return the value of longueur
     */
    public int getLongueur() {
        return longueur;
    }

    /**
     * Set the value of longueur
     *
     * @param longueur new value of longueur
     */
    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    /**
     * Get the value of hauteur
     *
     * @return the value of hauteur
     */
    public int getHauteur() {
        return hauteur;
    }

    /**
     * Set the value of hauteur
     *
     * @param hauteur new value of hauteur
     */
    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }
    
    /**
     * Get the value of image
     * @return 
     */
    public ArrayList<Integer> getImage() {
        return image;
    }
    /**
     * set the value of Image
     * @param image 
     */
    public void setImage(ArrayList<Integer> image) {
        this.image = image;
    }
    
    
    

}
