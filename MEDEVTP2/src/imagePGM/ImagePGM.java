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
    private int plusHaut = 255;

    /**
     * constructeur de base
     * @param hauteur
     * @param longueur 
     */
    public ImagePGM(int hauteur, int longueur) {
        this.hauteur = hauteur;
        this.longueur = longueur;
    }
    
    /**
     * constructeur par défaut
     */
    public ImagePGM() {
        hauteur = 1;
        longueur = 1;
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

    @Override
    public String toString() {
        return ("je suis une image PGM et j'ai "+ this.getHauteur()+ " en hauteur et "+ this.getLongueur() +" en longueur."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void seuillage(int i){
        try{
            int k;
            if (i>255||i<0){
                System.out.println("Parameter not in range");
            }else{
                for(int j=0;j<hauteur*longueur;i++){
                    k=this.image.get(j)-i;
                    if(k>=0){
                        this.image.set(j, 255);
                    } else{
                        this.image.set(j, 0);
                    }
                }
            }
            
            
            
        } 
        catch (Exception ex) {
            
        }
        
        
        
    }
    
    
}
