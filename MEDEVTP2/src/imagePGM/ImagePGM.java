/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imagePGM;

import java.util.ArrayList;

/**
 * gere les objets PGM
 *
 * @author gvedeau
 */
public class ImagePGM {

    private int hauteur;
    private int longueur;
    private ArrayList<Integer> image;
    private int plusHaut = 255;

    /**
     * constructeur de base
     *
     * @param hauteur
     * @param longueur
     */
    public ImagePGM(int hauteur, int longueur) {
        this.hauteur = hauteur;
        this.longueur = longueur;
        
        for(int i = 0; i<hauteur; i++){
            for(int j = 0; j<longueur;i++){
                this.image.set(i+j*this.longueur, new Integer(0));
            }
        }
    }

    /**
     * constructeur par défaut
     */
    public ImagePGM() {
        hauteur = 1;
        longueur = 1;
        for(int i = 0; i<hauteur; i++){
            for(int j = 0; j<longueur;i++){
                this.image.set(i+j*this.longueur, new Integer(0));
            }
        }
    }

    /**
     * Get the value of plusHaut
     *
     * @return the value of plusHaut
     */
    public int getPlusHaut() {
        return plusHaut;
    }

    /**
     * Set the value of plusHaut
     *
     * @param plusHaut new value of plusHaut
     */
    public void setPlusHaut(int plusHaut) {
        this.plusHaut = plusHaut;
    }

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
     *
     * @return
     */
    public ArrayList<Integer> getImage() {
        return image;
    }

    /**
     * set the value of Image
     *
     * @param image
     */
    public void setImage(ArrayList<Integer> image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return ("je suis une image PGM et j'ai " + this.getHauteur() + " en hauteur et " + this.getLongueur() + " en longueur."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param rapport
     */
    public ImagePGM agrandir(int rapport) {


        ImagePGM grandImage = new ImagePGM();
        
        if (rapport > 0) {
            grandImage.setHauteur(this.getHauteur() * rapport);
            grandImage.setLongueur(this.getLongueur() * rapport);

            for (int i = 0; i < grandImage.getHauteur(); i++) {
                for (int j = 0; j < grandImage.getLongueur(); j++) {

                    grandImage.getImage().set(i + grandImage.getLongueur() * j, new Integer(this.getImage().get((i + j * grandImage.getLongueur()) / rapport).intValue()));
                }

            }

        }
        return grandImage;

    }
}
