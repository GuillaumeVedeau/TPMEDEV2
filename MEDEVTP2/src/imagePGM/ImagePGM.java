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
        this.image = new ArrayList<>();

        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < longueur; j++) {
                this.image.add((i * this.longueur) + j, new Integer(0));
            }
        }
    }

    /**
     * constructeur par défaut
     */
    public ImagePGM() {
        hauteur = 1;
        longueur = 1;
        this.image = new ArrayList<>();

        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < longueur; j++) {
                this.image.add((i * this.longueur) + j, new Integer(0));
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
     * send back a bigger ImagePGM
     *
     * @param rapport
     */
    public ImagePGM agrandir(int rapport) {


        ImagePGM grandImage = new ImagePGM((this.getHauteur() * rapport), (this.getLongueur() * rapport));

        if (rapport > 0) {


            for (int i = 0; i < grandImage.getHauteur(); i++) {
                for (int j = 0; j < grandImage.getLongueur(); j++) {

                    grandImage.getImage().set((j + (grandImage.getLongueur() * i)), Integer.valueOf(this.getImage().get(j / rapport + (i / rapport) * this.getLongueur()).intValue()));
                }

            }

        }
        return grandImage;

    }

    /**
     * send back a smaller PGM if the rapport permit it
     *
     * @param rapport
     * @return
     */
    public ImagePGM retrecir(int rapport) {

        ImagePGM petitImage = new ImagePGM();

        if (rapport > 0 && (this.getLongueur() % rapport == 0) && this.getHauteur() % rapport == 0) {
            petitImage = new ImagePGM(this.getHauteur() / rapport, this.getLongueur() / rapport);

            for (int i = 0; i < petitImage.getHauteur(); i++) {
                for (int j = 0; j < petitImage.getLongueur(); j++) {

                    int moyenne = 0;

                    for (int k = 0; k < rapport; k++) {
                        for (int l = 0; l < rapport; l++) {
                            moyenne = moyenne + this.getImage().get(j * rapport + k + (l + i * rapport) * this.getLongueur()).intValue();
                        }

                    }

                    moyenne = moyenne / (rapport * rapport);

                    petitImage.getImage().set(i * petitImage.getLongueur() + j, new Integer(moyenne));
                }

            }
        }

        return petitImage;
    }

    public ImagePGM seuillage(int i) {
        ImagePGM imageSeuil = new ImagePGM(this.hauteur, this.longueur);
        if (i > 255 || i < 0) {
            System.out.println("Parameter not in range");
        } else {
            for (int j = 0; j < (hauteur * longueur); j++) {

                if ((this.image.get(j)) >= i) {
                    imageSeuil.image.set(j, 255);
                } else {
                    imageSeuil.image.set(j, 0);
                }
            }
        }
        return imageSeuil;

    }

    /**
     *
     * @param imageASoustraire correspond à l'image qui va être soustraite de
     * this
     * @return ImagePgm Difference des deux autres
     */
    public ImagePGM difference(ImagePGM imageASoustraire) {
        try {
            int k;
            if (this.hauteur == imageASoustraire.hauteur && this.longueur == imageASoustraire.longueur) {
                ImagePGM imageResultat = new ImagePGM(this.hauteur, this.longueur);
                for (int j = 0; j < hauteur * longueur; j++) {
                    k = this.image.get(j) - imageASoustraire.image.get(j);
                    if (k > 255) {
                        k = 255;
                    }
                    if (k < 0) {
                        k = 0;
                    }
                    imageResultat.image.set(j, k);
                }
                return imageResultat;
            } else {
                System.out.println("Les images ne sont pas de même taille");
            }
        } catch (Exception ex) {
        }
        return null;

    }
}
